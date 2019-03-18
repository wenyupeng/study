package com.example.testwebexception.controller;

import com.alibaba.fastjson.JSON;
import com.example.testwebexception.exception.SoftException;
import com.example.testwebexception.pojo.ErrorInfo;
import com.example.testwebexception.utils.ExceptionUtil;
import com.google.common.collect.Maps;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * 全局异常处理，捕获所有Controller中抛出的异常。
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * Logger
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	// 是否开启异常推栈内容的输出
	@Value("${ham.common.reutrnExceptionStackTraceElement:false}")
	private boolean reutrnExceptionStackTraceElement;

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Object jsonErrorHandler(HttpServletRequest request, Exception e, HttpServletResponse response) {

		ErrorInfo<String> r = new ErrorInfo<>();
		
		SoftException ex = ExceptionUtil.packExceptionMsg(e);
		
		r.setMessage(ex.getMessage());
		r.setErrorId(MDC.get("requestId"));
		r.setUrl(request.getRequestURL().toString());
		r.setErrorCode(ex.getErrorCode());
		r.setErrorDate(new Date());

		// 错误堆栈信息
		StringBuilder sb = new StringBuilder();
		StackTraceElement[] stackTrace = e.getStackTrace();
		sb.append(e.getMessage()).append("\r\n");
		for (StackTraceElement stackTraceElement : stackTrace) {
			sb.append(stackTraceElement).append("\r\n");
		}

		LOGGER.error(JSON.toJSONString(r));
		LOGGER.error(sb.toString());

		// 返回信息
		Map<String, Object> returnMap = Maps.newHashMap();
		returnMap.put("url", r.getUrl());
		returnMap.put("code", r.getErrorCode());
		returnMap.put("message", r.getMessage());
		returnMap.put("errorDate", new Date());
		if (reutrnExceptionStackTraceElement) {
			returnMap.put("Throwable", "\r以下信息必须在生产环境去除\r" + sb.toString());
		}
		returnMap.put("errorId", r.getErrorId());// 事件错误编号

		ModelAndView mav = new ModelAndView();

		// 参考Spring Boot默认的错误处理返回
		MappingJackson2JsonView view = new MappingJackson2JsonView();
		view.setAttributesMap(returnMap);
		mav.setView(view);
		response.setStatus(HttpStatus.SC_BAD_REQUEST);

		return mav;
	}

}
