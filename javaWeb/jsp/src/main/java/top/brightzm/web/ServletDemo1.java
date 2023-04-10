package top.brightzm.web;

import top.brightzm.pojo.Brand;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/demo1")
public class ServletDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 转发数据到jsp
        ArrayList<Brand> brands = new ArrayList<>();

        brands.add(new Brand(1,"HUAWEI","华为技术有限公司",100,"无",1));
        brands.add(new Brand(2,"ALIBABA","阿里",200,"无",1));
        brands.add(new Brand(3,"APPLE","苹果",100,"无",1));

        request.setAttribute("brands", brands);
        request.getRequestDispatcher("/jsp-foreach.jsp").forward(request, response);

        /*request.setAttribute("value", 1);

        request.getRequestDispatcher("/jstl-if.jsp").forward(request, response);*/

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
