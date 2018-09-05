package com.lx;

import java.util.Timer;
import java.util.TimerTask;

/**
 * description 定时器
 * projectName  threadlearn
 * package com.lx
 *
 * @author xingli12
 * @version v1
 * @date Created in 2018-09-04 09:50
 * modified By
 * updateDate
 */
public class Demo5Timer {
    public static void main(String[] args) {

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            //实现定时任务
            public void run() {
                System.out.println("timertask is run");
            }
        },0,1000);
    }
}
