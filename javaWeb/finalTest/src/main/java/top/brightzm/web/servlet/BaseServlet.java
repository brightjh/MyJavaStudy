package top.brightzm.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/27 下午4:33
 */
public class BaseServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 分发请求

        // 获取请求路径
        String uri = req.getRequestURI();


        // 获取最后一段路径 即需要执行的方法名
        int index = uri.lastIndexOf('/');


        String methodName = uri.substring(index + 1);



        // 执行方法
        // 获取class文件
        Class<? extends BaseServlet> cls = this.getClass();
        // 获取method对象
        try {
            Method method = cls.getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);

            method.invoke(this,req,resp);

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
