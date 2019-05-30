package com.wen._01springmvc.spring10taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: wen
 * @Date: 2019/5/19 12:59
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println(" execute the asynchronous task :"+i);
    }
    @Async
    public void executoAsyncTaskPlus(Integer i){
        System.out.println(" execitte the asynchronous task plus : "+(i+1));
    }
}
