package top.brightzm.web.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/session02")
public class Session02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 从session中获取数据
        // 1.获取session对象
        HttpSession session = req.getSession();

        //访问session的地址值
        System.out.println(session);

        // 2.获取数据
        Object username = session.getAttribute("username");
        System.out.println(username);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
