package top.brightzm;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.brightzm.dao.BookDao;
import top.brightzm.dao.UserDao;
import top.brightzm.domain.Book;
import top.brightzm.domain.User;

import java.util.List;

@SpringBootTest
class Springboot04MybatisPlusApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private BookDao bookDao;

    @Test
    void userDaoTest() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

    @Test
    void userDaoTest1() {
        // 按条件查询 and
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.lt(User::getAge, 30).gt(User::getAge, 10);
        List<User> users = userDao.selectList(lqw);
        System.out.println(users);

    }

    @Test
    void bookDaoTest2() {
        // or
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.lt(User::getAge, 10).or().gt(User::getAge, 30);
        List<User> users = userDao.selectList(lqw);
        System.out.println(users);

    }

    // 条件查询
    @Test
    void userDaoTest3() {
        LambdaQueryWrapper<User> lwq = new LambdaQueryWrapper<>();

        // 等值判断
        /*String name = "brightzm";
        String password = "brightzm";
        lwq.eq(null != name,User::getName,name).eq(null!= password,User::getPassword,password);
        User user = userDao.selectOne(lwq);
        System.out.println(user);*/

        // 范围查询
        /*lwq.between(User::getAge,10,30);
        List<User> users = userDao.selectList(lwq);
        System.out.println(users);*/

        // 模糊查询
        /*//lwq.likeLeft(User::getName,'m');
        //lwq.likeRight(User::getName,'b');
        lwq.like(User::getName,'r');

        List<User> users = userDao.selectList(lwq);
        System.out.println(users);*/

        // 排序查询
        //lwq.orderBy(true,true,User::getId);
        lwq.orderBy(true, false, User::getId);
        List<User> users = userDao.selectList(lwq);
        System.out.println(users);

    }


    @Test
    void bookDaoSelectTest() {
        LambdaQueryWrapper<Book> lwq = new LambdaQueryWrapper<>();
        List<Book> books = bookDao.selectList(lwq);
        System.out.println(books);
    }

    @Test
    void TestBookDaoAdd() {
        Book book = new Book();
        book.setType("计算机");
        book.setBookName("鸟哥的linux私房菜");
        book.setDescription("linux入门");
        bookDao.insert(book);
    }

    @Test
    void TestBookDaoDel() {
        bookDao.deleteById(1L);
    }

    @Test
    void OptimisticLocker() {
        Book book1 = bookDao.selectById(2L);
        Book book2 = bookDao.selectById(2L);
        // 线程一
        book1.setType("计算机");
        bookDao.updateById(book1);


        // 线程二
        book2.setType("计算机专业");
        bookDao.updateById(book2);

    }

}
