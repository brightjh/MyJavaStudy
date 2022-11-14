package top.brightzm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.brightzm.config.SpringConfig;
import top.brightzm.domain.Book;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/11 下午9:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void selectAll(){
        List<Book> books = bookService.selectAll();
        System.out.println(books);
    }

    @Test
    public void selectById(){
        Book book = bookService.selectById(1);
        System.out.println(book);
    }

}
