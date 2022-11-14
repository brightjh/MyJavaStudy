package top.brightzm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @description: springMVC配置类
 * @author: bright
 * @time: 2022/11/10 下午5:12
 */
@Configuration
@ComponentScan({"top.brightzm.controller","top.brightzm.config"})
@EnableWebMvc
public class SpringmvcConfig {
}
