package top.brightzm.service.impl;

import org.springframework.stereotype.Service;
import top.brightzm.dao.BookDao;
import top.brightzm.dao.UserDao;
import top.brightzm.service.BookService;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/29 下午4:53
 */
@Service("bookService")
public class BookServiceImpl implements BookService{

    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl() {
    }

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
   public void save(){
       System.out.println("BookService save.......");
       bookDao.save();
       userDao.save();
       System.out.println(userDao);
   }

    public void setBookDao(BookDao bookDao) {
        System.out.println("set...");
       this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao){
       this.userDao = userDao;
    }


    /**
     * 获取
     * @return bookDao
     */
    public BookDao getBookDao() {
        return bookDao;
    }

    /**
     * 获取
     * @return userDao
     */
    public UserDao getUserDao() {
        return userDao;
    }

    public String toString() {
        return "BookServiceImpl{bookDao = " + bookDao + ", userDao = " + userDao + "}";
    }
}
