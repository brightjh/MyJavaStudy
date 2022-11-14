package top.brightzm.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 放行前 对request进行处理
        System.out.println("filter1...");

        // 放行
        filterChain.doFilter(servletRequest,servletResponse);

        // 放行后,对response进行处理
        System.out.println("filter3.....");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
