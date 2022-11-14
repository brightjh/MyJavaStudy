package top.brightzm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.brightzm.config.SpringConfig;
import top.brightzm.service.ResourcesService;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        ResourcesService service = ctx.getBean(ResourcesService.class);

        boolean flag = service.openURL("https:baidu.com","root ");

        System.out.println(flag);
    }
}