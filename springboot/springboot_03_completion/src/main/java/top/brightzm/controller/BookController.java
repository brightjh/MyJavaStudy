package top.brightzm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.brightzm.BusinessException;
import top.brightzm.SystemException;
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
        if (id < 0) {
            throw new BusinessException(Code.BUSINESS_EX, "操作不规范");
        }

        Book book = bookService.selectById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "获取信息失败,请重试";
        return new Result(code, book, msg);
    }

    @PostMapping
    public Result add(@RequestBody Book book) {
        boolean flag = bookService.add(book);
        Integer code = flag ? Code.ADD_OK : Code.ADD_ERR;
        return new Result(code, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        Integer code = flag ? Code.UPDATE_OK : Code.UPDATE_ERR;
        return new Result(code, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.del(id);
        Integer code = flag ? Code.DEL_OK : Code.DEL_ERR;
        return new Result(code, flag);
    }

}
