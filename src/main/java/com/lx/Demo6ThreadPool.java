package com.lx;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * description 线程池
 * projectName  threadlearn
 * package com.lx
 *
 * @author xingli12
 * @version v1
 * @date Created in 2018-09-04 10:00
 * modified By
 * updateDate
 */
public class Demo6ThreadPool {

    public static void main(String[] args) {

//        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        ExecutorService threadPool = Executors.newCachedThreadPool();


        for (int i = 0; i < 100; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }


        threadPool.shutdown();
    }



}
