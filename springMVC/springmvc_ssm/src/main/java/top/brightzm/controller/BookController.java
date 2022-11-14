package top.brightzm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.brightzm.domain.Book;
import top.brightzm.service.BookService;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/11 下午8:31
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> selectAll(){
        List<Book> books = bookService.selectAll();
        return books;
    }

    @GetMapping("/{id}")
    public Book selectById(@PathVariable Integer id){
        Book book = bookService.selectById(id);
        return book;
    }

    @PostMapping
    public void add(@RequestBody Book book){
        boolean flag = bookService.add(book);
    }

    @PutMapping
    public void update(@RequestBody Book book){
        boolean flag = bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        boolean flag = bookService.del(id);
    }

}
