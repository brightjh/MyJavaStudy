package top.brightzm.web.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/session01")
public class Session01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 存储数据到session中
        //1. 获取session对象
        HttpSession session = req.getSession();

        // 输出session的地址值
        System.out.println(session);

        //2. 存储数据
        session.setAttribute("username","xl");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
