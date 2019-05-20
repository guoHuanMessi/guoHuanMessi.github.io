package com.test.Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 实现一个倒计时功能
 */
public class BlockedSleep {
    public static void main(String[] args) {

        Date endTime = new Date(System.currentTimeMillis() + 10 * 1000);
        long end = endTime.getTime();

        while (true) {
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            endTime = new Date(endTime.getTime() - 1000);
            if (end - endTime.getTime() > 10000) {
                break;
            }
        }


    }
}
