package top.brightzm.web.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/rep3")
public class ResponseDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // response 输出字符
        response.setContentType("text/html;charset=utf-8");
        // 获取字符输出流
        PrintWriter writer = response.getWriter();

        // 设置头部信息
        response.setHeader("content-type","text/html");

        writer.write("你好");
        writer.write("<h1>aaa</h1>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
