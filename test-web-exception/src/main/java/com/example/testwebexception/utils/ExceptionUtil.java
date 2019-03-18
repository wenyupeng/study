package com.example.testwebexception.utils;

import com.example.testwebexception.exception.SoftException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MissingServletRequestParameterException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ExceptionUtil {

	/**
	 * 包装全局异常错误信息
	 * 
	 * @param e
	 * @return
	 */
	public static SoftException packExceptionMsg(Exception e) {
		SoftException ex = null;
		if (e != null) {
			if (e instanceof SoftException) {
				ex = (SoftException) e;
			} else if (e instanceof BindException) {
				StringBuilder sb = new StringBuilder();
				List<ObjectError> allErrors = ((BindException) e).getAllErrors();
				if (allErrors != null && !allErrors.isEmpty()) {
					for (int i = 0; i < allErrors.size(); i++) {
						if ("typeMismatch".equals(allErrors.get(i).getCode())) {
							sb.append("参数绑定错误，请检查提交的参数数据类型" + "\r\n");
						} else {
							sb.append(allErrors.get(i).getDefaultMessage() + "\r\n");
						}
					}
				}
			} else if (e instanceof MissingServletRequestParameterException) {
			} else if (e instanceof HttpMessageNotReadableException) {
			} else {
			}
		}
		return ex;
	}

}
