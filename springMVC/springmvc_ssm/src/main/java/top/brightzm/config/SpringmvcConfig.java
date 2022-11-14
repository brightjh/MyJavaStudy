package top.brightzm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/11 下午7:09
 */
@Configuration
@ComponentScan("top.brightzm.controller")
@EnableWebMvc
public class SpringmvcConfig {
}
