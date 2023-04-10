package top.brightzm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/22 下午7:05
 */
@Configuration
@ComponentScan({"top.brightzm.controller", "top.brightzm.config"})
@EnableWebMvc
public class SpringmvcConfig {
}
