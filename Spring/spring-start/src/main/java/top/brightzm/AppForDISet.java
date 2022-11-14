package top.brightzm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.brightzm.service.BookService;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/29 下午4:54
 */
public class AppForDISet {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) ctx.getBean("bookService");

        bookService.save();

    }
}
