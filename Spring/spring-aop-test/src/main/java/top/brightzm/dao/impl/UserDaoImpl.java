package top.brightzm.dao.impl;

import org.springframework.stereotype.Repository;
import top.brightzm.dao.UserDao;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/2 下午9:24
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao save....");
    }
}
