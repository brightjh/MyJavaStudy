package top.brightzm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.brightzm.service.BookService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml.bak");

        BookService bookService = ctx.getBean("bookService", BookService.class);

        System.out.println(bookService);
    }
}