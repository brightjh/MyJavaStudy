package top.brightzm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.brightzm.dao.BookDao;
import top.brightzm.domain.Book;
import top.brightzm.service.BookService;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/23 下午10:42
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Book getById(Integer id) {
        Book book = bookDao.getById(id);
        return book;
    }
}
