package com.wen.spring10taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wen
 * @Date: 2019/5/19 13:07
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executoAsyncTaskPlus(i);
        }
        context.close();
    }
}
