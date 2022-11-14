package top.brightzm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.brightzm.config.SpringConfig;
import top.brightzm.dao.BookDao;
import top.brightzm.service.BookService;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/31 下午8:14
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        System.out.println(bookDao);



    }


}
