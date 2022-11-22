package top.brightzm.service;

import org.springframework.transaction.annotation.Transactional;
import top.brightzm.domain.Book;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/22 下午6:45
 */
@Transactional
public interface BookService {

    public List<Book> selectAll();

    public Book selectById(Integer id);

    public boolean add(Book book);

    public boolean update(Book book);

    public boolean del(Integer id);
}
