package top.brightzm.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import top.brightzm.domain.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/10 下午7:08
 */
@RestController
@RequestMapping("/books")
public class BookController {



    @GetMapping
    public List<Book> getAll() {
        System.out.println("book getAll");
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setType("计算机类型");
        book1.setName("Java核心技术");
        book1.setPrice(99.9);
        book1.setDescription("Java最全技术");
        books.add(book1);

        Book book2 = new Book();
        book2.setType("计算机类型");
        book2.setName("深入理解计算机操作系统");
        book2.setPrice(99.9);
        book2.setDescription("计算机知识");
        books.add(book2);
        return books;
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("book getById" + id);
        return "{'book':'getById'}";
    }

    @PostMapping
    public String add(@RequestBody Book book) {
        System.out.println("book add" + book);

        return "{'book':'add'}";


    }

    @PutMapping
    public String update(@RequestBody Book book) {
        System.out.println("book update" + book);
        return "{'book':'update'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("book delete" + id);
        return "{'book':'delete'}";
    }

}
