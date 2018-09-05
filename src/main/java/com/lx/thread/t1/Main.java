package com.lx.thread.t1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description
 * projectName  threadlearn
 * package com.lx.thread.t1
 *
 * @author xingli12
 * @version v1
 * @date Created in 2018-09-04 15:35
 * modified By
 * updateDate
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        DemoService ds = ac.getBean(DemoService.class);

        ds.a();
        ds.b();
    }
}
