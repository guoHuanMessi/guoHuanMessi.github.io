package com.spring.test.springdemo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestJob {

    @Scheduled(cron = "0/2 * * * * *")
    public void timerJob() {
        System.out.println("sprinboot 自带定时器-------朱欢是个逗比");
    }

}
