package com.wen;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Author: wen
 * @Date: 2019/5/26 16:18
 */
public class WebInitialize implements WebApplicationInitializer {
    //替代web.xml的作用,设置关联servletContext
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(MyMvcConfig.class);
        ctx.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));//注册DispatcherServlet
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        //开启异步方法
        servlet.setAsyncSupported(true);
    }
}
