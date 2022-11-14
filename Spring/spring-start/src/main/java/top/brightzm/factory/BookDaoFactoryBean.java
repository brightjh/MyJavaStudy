package top.brightzm.factory;

import org.springframework.beans.factory.FactoryBean;
import top.brightzm.dao.BookDao;
import top.brightzm.dao.impl.BookDaoImpl;

/**
 * @description: 实例化工厂和factory对象
 * @author: bright
 * @time: 2022/10/29 下午8:16
 */
public class BookDaoFactoryBean implements FactoryBean<BookDaoImpl> {


    @Override
    public BookDaoImpl getObject() throws Exception {
        return new BookDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return BookDao.class;
    }
}
