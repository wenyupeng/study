package com.wen._01springmvc.spring11taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: wen
 * @Date: 2019/5/25 22:32
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelay = 5000)//每隔固定的时间执行
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次 " + DATE_FORMAT.format(new Date()));
    }

    @Scheduled(cron = "0 05 23 ? * *")//按照指定的时间执行
    public void fixTimeExecution() {
        System.out.println("在指定时间 " + DATE_FORMAT.format(new Date()) + " 执行");
    }
}
