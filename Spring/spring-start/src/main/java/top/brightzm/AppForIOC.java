package top.brightzm;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.brightzm.dao.BookDao;

/**
 * @description: spring入门 Ioc管理 使用bean
 * @author: bright
 * @time: 2022/10/29 下午5:03
 */
public class AppForIOC {

    public static void main(String[] args) {
        // 获取Ioc容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        // 注册容器关闭钩子
        ctx.registerShutdownHook();

        // 获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        bookDao.save();

        /*BookService bookService = (BookService) ctx.getBean("bookService");

        bookService.save();*/


    }



}
