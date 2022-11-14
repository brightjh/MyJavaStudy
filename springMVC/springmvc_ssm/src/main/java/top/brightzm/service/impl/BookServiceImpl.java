package top.brightzm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.brightzm.dao.BookDao;
import top.brightzm.domain.Book;
import top.brightzm.service.BookService;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/11 下午8:30
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> selectAll() {
        List<Book> books = bookDao.selectAll();
        return books;
    }

    @Override
    public Book selectById(Integer id) {
        Book book = bookDao.selectById(id);
        return book;
    }

    @Override
    public boolean add(Book book) {
        bookDao.add(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean del(Integer id) {
        bookDao.del(id);
        return true;
    }
}
