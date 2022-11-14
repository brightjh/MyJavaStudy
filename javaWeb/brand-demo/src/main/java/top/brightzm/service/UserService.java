package top.brightzm.service;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.brightzm.mapper.UserMapper;
import top.brightzm.pojo.User;
import top.brightzm.util.SqlSessionFactoryUtils;

public class UserService {

    // 获取sqlSessionFactory对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /*
    * 登录方法
    * */
    public User login(String username,String password){
        // 获取sqlSession
        SqlSession sqlSession = factory.openSession();
        // 调用mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 执行方法
        User user = mapper.select(username, password);
        // 释放资源
        sqlSession.close();
        // 返回用户对象
        return user;
    }


    /*
    * 注册方法
    * */
    public boolean register(User user){
        // 获取sqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 判断用户名是否存在
        // 根据用户名判断用户是否存在
        User newUser = mapper.selectByUsername(user.getUsername());

        if (newUser != null){
            // 用户存在
            return false;
        }
        // 用户不存在
        // 调用添加方法
        mapper.add(user);
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
        // 返回值
        return true;
    }


}
