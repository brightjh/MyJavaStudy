package top.brightzm.web;

import top.brightzm.pojo.User;
import top.brightzm.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    // 获取service对象
    private UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 接受用户数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String remember = req.getParameter("remember");

        // 调用service方法
        User user = service.login(username, password);

        // 判断用户是否存在
        if (user == null) {
            // 用户不存在 登录失败
            // 存储错误信息到request中
            req.setAttribute("error_msg", "用户名或密码错误");
            // 跳转回页面
            req.getRequestDispatcher("/login.jsp").forward(req, res);

        } else {
            // 用户存在 登录成功

            // 判断是否选择记住用户
            if ("1".equals(remember)) {
                // 创建cookie对象
                Cookie cUsername = new Cookie("username", username);
                Cookie cPassword = new Cookie("password", password);

                // 持久化存储
                cUsername.setMaxAge(60 * 60 * 24 * 7);
                cPassword.setMaxAge(60 * 60 * 24 * 7);

                // 发送
                res.addCookie(cUsername);
                res.addCookie(cPassword);

            }

            // 将用户写入session
            HttpSession session = req.getSession();
            session.setAttribute("user", user);

            String contextPath = req.getContextPath();
            res.sendRedirect(contextPath + "/selectAllServlet");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
