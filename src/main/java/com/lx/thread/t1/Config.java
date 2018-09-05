package com.lx.thread.t1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * description Spring异步任务
 * projectName  threadlearn
 * package com.lx.thread.t1.config
 *
 * @author xingli12
 * @version v1
 * @date Created in 2018-09-04 15:25
 * modified By
 * updateDate
 */

@Configuration
@ComponentScan("com.lx.thread.t1")
@EnableAsync
public class Config {

}
