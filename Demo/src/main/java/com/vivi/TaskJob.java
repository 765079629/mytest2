package com.vivi;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component()
public class TaskJob {


    @Scheduled(cron = "0/5 * * * * ?")
    public void job1() {
        System.out.println("每十秒输出一次");
    }
}