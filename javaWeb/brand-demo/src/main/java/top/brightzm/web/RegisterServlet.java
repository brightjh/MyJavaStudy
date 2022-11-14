package top.brightzm.web;

import top.brightzm.pojo.User;
import top.brightzm.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // 接受用户数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCodeInfo = req.getParameter("checkCode");

        // 通过session中获取验证码
        HttpSession session = req.getSession();

        String checkCode = (String) session.getAttribute("checkCode");

        if (!(checkCode.equalsIgnoreCase(checkCodeInfo))) {
            req.setAttribute("register_msg", "验证码错误");
            req.getRequestDispatcher("/register.jsp").forward(req, res);
            return;
        }

        // 将用户数据封装到用户对象中
        User user = new User();

        user.setUsername(username);
        user.setPassword(password);

        // 调用service方法
        boolean result = service.register(user);

        String message;
        String path;

        if (result) {
            // 注册成功 跳转到登录界面
            message = "注册成功,请登录";
            path = "/login.jsp";
        } else {
            // 注册失败 返回注册失败信息
            message = "用户名已存在";
            path = "/register.jsp";

        }
        System.out.println(path);
        req.setAttribute("register_msg", message);
        req.getRequestDispatcher(path).forward(req, res);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
