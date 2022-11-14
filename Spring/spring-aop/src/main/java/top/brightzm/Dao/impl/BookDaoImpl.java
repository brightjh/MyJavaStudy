package top.brightzm.Dao.impl;

import org.springframework.stereotype.Repository;
import top.brightzm.Dao.BookDao;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/1 下午10:36
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("BookDao save....");
    }

    @Override
    public void update() {
        System.out.println("BookDao update....");
    }

    @Override
    public int selectAll() {


        return 100;
    }
}
