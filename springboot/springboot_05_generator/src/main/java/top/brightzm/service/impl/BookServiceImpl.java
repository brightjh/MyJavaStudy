package top.brightzm.service.impl;

import top.brightzm.domain.Book;
import top.brightzm.dao.BookDao;
import top.brightzm.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author brightzm
 * @since 2022-11-25
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

}
