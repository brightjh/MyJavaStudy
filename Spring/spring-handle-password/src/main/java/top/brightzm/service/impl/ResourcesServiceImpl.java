package top.brightzm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.brightzm.dao.ResourcesDao;
import top.brightzm.service.ResourcesService;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/4 上午10:56
 */
@Service
public class ResourcesServiceImpl implements ResourcesService {

    @Autowired
    private ResourcesDao resourcesDao;

    @Override
    public boolean openURL(String url, String password) {
        return resourcesDao.readResource(url,password);
    }
}
