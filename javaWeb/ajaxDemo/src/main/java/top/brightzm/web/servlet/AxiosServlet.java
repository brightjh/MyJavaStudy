package top.brightzm.web.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/axiosServlet")
public class AxiosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("get.......");

        // 获取用户数据
        String username = req.getParameter("username");
        System.out.println(username);

        // 写入响应数据
        res.getWriter().write("hello axios~~~");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("post........");
        doGet(req, res);
    }
}
