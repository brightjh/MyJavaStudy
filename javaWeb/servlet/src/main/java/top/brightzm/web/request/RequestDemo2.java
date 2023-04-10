package top.brightzm.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/req1")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get....");
        // 获取所有参数的Map集合
        Map<String, String[]> map = req.getParameterMap();
        // 获取key
        for (String key: map.keySet()){
            System.out.print(key+":");
            // 获取值
            String[] values = map.get(key);
            for (String value : values) {
                System.out.print(value+",");
            }
            System.out.println();
        }

        System.out.println("-------------");

        // 根据名称获取参数值
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies){
            System.out.println(hobby);
        }

        // 根据名称获取参数值
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
