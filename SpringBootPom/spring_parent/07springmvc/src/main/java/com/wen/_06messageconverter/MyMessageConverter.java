package com.wen._06messageconverter;

import com.wen._02domain.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @Author: wen
 * @Date: 2019/5/28 23:35
 */
public class MyMessageConverter extends AbstractHttpMessageConverter {
    //自定义媒体类型application/x-wen
    public MyMessageConverter() {
        super(new MediaType("application", "x-wen", Charset.forName("UTF-8")));
    }
    //处理输入内容
    @Override
    protected Object readInternal(Class clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(inputMessage.getBody(), Charset.forName("UTF-8"));
        String[] tempArr = temp.split("-");
        return new DemoObj(new Long(tempArr[0]), tempArr[1]);
    }

    //限制处理的类
    @Override
    protected boolean supports(Class clazz) {
        return DemoObj.class.isAssignableFrom(clazz);
    }

    //处理输出内容
    @Override
    protected void writeInternal(Object obj, HttpOutputMessage outputMessage)throws IOException,HttpMessageNotWritableException{
        DemoObj demoObj = (DemoObj) obj;
        String out = "hello :" + demoObj.getId() + "-" + demoObj.getName();
        outputMessage.getBody().write(out.getBytes());
    }
}
