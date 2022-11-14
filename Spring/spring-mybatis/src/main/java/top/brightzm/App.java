package top.brightzm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.brightzm.config.SpringConfig;
import top.brightzm.service.AccountService;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);

        System.out.println(accountService.findById(2));

    }

}