package top.brightzm.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @description: 定义一个servlet容器的配置类,在里面加载spring的配置
 * @author: bright
 * @time: 2022/11/8 下午3:36
 */

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    // 加载springmvc容器配置类
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        // 初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // 加载指定配置类
        ctx.register(SpringMvcConfig.class);

        return ctx;
    }

    // 设置由springmvc控制器处理的请求路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 加载spring容器配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
