package top.brightzm.web;

import top.brightzm.service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deleteBrand")
public class DeleteBrand extends HttpServlet {

    BrandService service = new BrandService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // 接受ID
        Integer id = Integer.parseInt(req.getParameter("id"));

        // 调用删除方法
        service.deleteBrand(id);

        // 转发数据
        req.getRequestDispatcher("/selectAllServlet").forward(req,res);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
