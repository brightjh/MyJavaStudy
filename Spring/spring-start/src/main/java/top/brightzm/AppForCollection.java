package top.brightzm;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.brightzm.service.BookService;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/30 下午4:51
 */
public class AppForCollection {

    public static void main(String[] args) {
        // 创建容器对象
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取bean
        BookService bookService = (BookService)ctx.getBean("bookService");
        System.out.println(bookService);

    }

}
