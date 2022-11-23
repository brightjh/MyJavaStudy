package top.brightzm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.brightzm.domain.Book;
import top.brightzm.service.BookService;

@SpringBootTest
class Springboot02MybatisApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    void bookServiceTest() {
        Book book = bookService.getById(1);
        System.out.println(book);
    }

}
