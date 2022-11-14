package top.brightzm.web.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 获取cookies

        Cookie[] cookies = req.getCookies();

        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if ("name".equals(name)) {
                String value = cookie.getValue();

                // URL解码
                value = URLDecoder.decode(value, StandardCharsets.UTF_8);

                System.out.println("name :" + name);
                System.out.println("value :" + value);

            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
