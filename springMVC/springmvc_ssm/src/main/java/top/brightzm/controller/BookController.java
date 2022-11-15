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
    public Result getAll() {
        List<Book> books = bookService.selectAll();
        Integer code = books != null ? Code.GET_OK : Code.GET_ERR;
        String msg = books != null ? "" : "获取信息失败,请重试";
        return new Result(code, books, msg);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.selectById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "获取信息失败,请重试";
        return new Result(code, book, msg);
    }

    @PostMapping
    public Result add(@RequestBody Book book) {
        boolean flag = bookService.add(book);
        Integer code = flag ? Code.ADD_OK : Code.ADD_ERR;
        String msg = flag ? "" : "添加失败,请重试";
        return new Result(code, msg);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        Integer code = flag ? Code.UPDATE_OK : Code.UPDATE_ERR;
        String msg = flag ? "" : "修改失败,请重试";
        return new Result(code, msg);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.del(id);
        Integer code = flag ? Code.DEL_OK : Code.DEL_ERR;
        String msg = flag ? "" : "删除失败,请重试";
        return new Result(code,msg);
    }

}
