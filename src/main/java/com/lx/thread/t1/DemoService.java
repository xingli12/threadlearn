package com.lx.thread.t1;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * description
 * projectName  threadlearn
 * package com.lx.thread.t1
 *
 * @author xingli12
 * @version v1
 * @date Created in 2018-09-04 15:29
 * modified By
 * updateDate
 */

@Service
public class DemoService {

    @Async
    public void a() {
        while (true) {
            System.out.println("a");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Async
    public void b() {
        while (true) {
            System.out.println("b");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
