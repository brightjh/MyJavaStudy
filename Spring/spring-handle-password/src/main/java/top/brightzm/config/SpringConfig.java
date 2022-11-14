package top.brightzm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/4 上午11:23
 */
@Configuration
@ComponentScan("top.brightzm")
@EnableAspectJAutoProxy
public class SpringConfig {
}
