package top.brightzm.web.request;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo2",loadOnStartup = 1)
public class ServletDemo02 implements Servlet {

    ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        // 初始化方法
        this.config = servletConfig;
        System.out.println("init...............");

    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet..................");
    }

    @Override
    public void destroy() {
        System.out.println("destroy..................");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public String getServletInfo() {
        return null;
    }
}
