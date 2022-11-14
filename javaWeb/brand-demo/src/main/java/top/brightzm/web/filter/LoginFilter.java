package top.brightzm.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        // 放行前操作

        HttpServletRequest req = (HttpServletRequest) request;
        // 判断访问资源是否和登录注册相关
        String[] urls = {"/login.jsp","/login","/register.jsp","/register","/css/","/imgs/"};
        String url = req.getRequestURL().toString();

        // 判断session中是否有user(即用户是否登录)
        // 获取session对象
        HttpSession session = req.getSession();

        // 循环判断
        for (String u : urls){
            if (url.contains(u)){
                // 放行
                chain.doFilter(request,response);
                return;
            }
        }

        // 判断user对象是否为空
        Object user = session.getAttribute("user");
        if (user == null){
            // 用户未登录
            // 跳转到登录界面,存储登录信息
            req.setAttribute("error_msg","您还没有登录,请登录!");
            req.getRequestDispatcher("/login.jsp").forward(request,response);
            return;
        }

        // 放行
        chain.doFilter(request,response);

        // 放行后操作


    }

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }
}
