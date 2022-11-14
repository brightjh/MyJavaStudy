package top.brightzm.web.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 发送cookie

        // 存储中文
        String value = "张三";
        // 转为url编码
        value = URLEncoder.encode(value, StandardCharsets.UTF_8);
        System.out.println(value);;

        Cookie cookie = new Cookie("name",value);

        // 设置存活时间
        cookie.setMaxAge(60*60*20*7);

        res.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
