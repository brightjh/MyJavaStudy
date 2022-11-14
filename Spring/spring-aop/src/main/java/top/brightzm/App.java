package top.brightzm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.brightzm.Dao.BookDao;
import top.brightzm.config.SpringConfig;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = ctx.getBean(BookDao.class);

        //bookDao.update();

        int i = bookDao.selectAll();
        System.out.println(i);
    }
}