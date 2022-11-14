package top.brightzm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/1 下午10:38
 */
@Configuration
@ComponentScan("top.brightzm")
@EnableAspectJAutoProxy
public class SpringConfig {
}
