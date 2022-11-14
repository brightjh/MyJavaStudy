package top.brightzm.web.test;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.brightzm.mapper.UserMapper;
import top.brightzm.pojo.User;
import top.brightzm.utils.SqlSessionFactoryUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/register")
public class register extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 注册的实现
        // 获取用户名和密码
        String newName = req.getParameter("username");
        String newPassword = req.getParameter("password");

        User newUser = new User();
        newUser.setUsername(newName);
        newUser.setPassword(newPassword);

        // 使用mybatis添加用户
        // 获取sqlsession
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 判断用户名是否重复
        User user = mapper.selectByName(newName);
        boolean result = user == null;

        // 添加用户并返回信息
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        if (result) {
            mapper.add(newUser);
            writer.write("注册成功");

            // 提交事务
            sqlSession.commit();
            sqlSession.close();
        } else {
            writer.write("用户名重复");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
