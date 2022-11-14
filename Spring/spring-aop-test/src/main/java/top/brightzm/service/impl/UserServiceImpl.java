package top.brightzm.service.impl;

import org.springframework.stereotype.Service;
import top.brightzm.dao.UserDao;
import top.brightzm.service.UserService;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/2 下午9:39
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("BookDao select...");
    }



}
