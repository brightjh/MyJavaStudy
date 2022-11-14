package top.brightzm.config;

import org.springframework.context.annotation.*;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/2 下午9:26
 */
@Configuration
@ComponentScan("top.brightzm")
@PropertySource("classpath:jdbc.properties")
@Import({MybatisConfig.class, JdbcConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
