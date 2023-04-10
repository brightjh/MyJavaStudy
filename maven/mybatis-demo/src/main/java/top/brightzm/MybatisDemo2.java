package top.brightzm;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.brightzm.mapper.UserMapper;
import top.brightzm.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDemo2 {
    public static void main(String[] args) throws IOException {
        // mapper代理开发

        //1. 加载mybatis核心配置文件，获取sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取sqlSession对象，执行sql语句
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 通过sqlSession的getMapper方法获取Mapper接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 调用方法
        List<User> users = userMapper.selectAll();

        System.out.println(users);

        // 释放资源
        sqlSession.close();

    }
}
