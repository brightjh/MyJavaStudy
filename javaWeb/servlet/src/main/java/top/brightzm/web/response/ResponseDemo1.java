package top.brightzm.web.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/res1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("res1...");
        /*// 重定向
        // 设置状态码
        response.setStatus(302);
        // 设置响应头
        response.setHeader("location","/servlet/res2");*/

        // 简化重定向
        response.sendRedirect("res2");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
