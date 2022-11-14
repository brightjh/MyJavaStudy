package top.brightzm.service;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;
import top.brightzm.domain.Book;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/11 下午8:30
 */
@Transactional
public interface BookService {

    public List<Book> selectAll();

    public Book selectById(Integer id);

    public boolean add(Book book);

    public boolean update(Book book);

    public boolean del(Integer id);
}
