package top.brightzm.dao.impl;

import org.springframework.stereotype.Repository;
import top.brightzm.dao.ResourcesDao;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/4 上午10:54
 */
@Repository
public class ResourceDaoImpl implements ResourcesDao {
    @Override
    public boolean readResource(String url, String password) {
        // 模拟校验
        return password.equals("root");
    }
}
