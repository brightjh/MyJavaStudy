package top.brightzm.web;

import top.brightzm.pojo.Brand;
import top.brightzm.service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/selectByIdServlet")
public class SelectByIdServlet extends HttpServlet {
    // 获取service对象
    BrandService service = new BrandService();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取id
        Integer id = Integer.parseInt(request.getParameter("id"));

        // 调用方法
        Brand brand = service.selectById(id);

        // 写入数据
        request.setAttribute("brand",brand);

        // 转发数据
        request.getRequestDispatcher("/update.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
