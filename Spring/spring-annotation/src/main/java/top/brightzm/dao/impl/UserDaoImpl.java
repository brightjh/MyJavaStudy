package top.brightzm.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import top.brightzm.dao.UserDao;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/29 下午11:11
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    private int connectionNum;
    private String databaseName;


    public UserDaoImpl() {
    }

    public UserDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("UserDao save....");
    }

    /**
     * 获取
     * @return connectionNum
     */
    public int getConnectionNum() {
        return connectionNum;
    }

    /**
     * 设置
     * @param connectionNum
     */
    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    /**
     * 获取
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * 设置
     * @param databaseName
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String toString() {
        return "UserDaoImpl{connectionNum = " + connectionNum + ", databaseName = " + databaseName + "}";
    }
}
