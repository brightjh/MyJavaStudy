package top.brightzm.service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.brightzm.domain.Book;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/11 下午9:31
 */

@SpringBootTest
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
