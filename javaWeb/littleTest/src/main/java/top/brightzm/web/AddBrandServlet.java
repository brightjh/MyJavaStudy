package top.brightzm.web;

import com.alibaba.fastjson.JSON;
import top.brightzm.pojo.Brand;
import top.brightzm.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


@WebServlet("/addBrandServlet")
public class AddBrandServlet extends HttpServlet {

    BrandService service = new BrandService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 接收请求体数据
        BufferedReader br = req.getReader();
        String params = br.readLine();

        // 将json字符串转为Brand对象
        Brand brand = JSON.parseObject(params, Brand.class);

        // 调用service添加
        service.addBrand(brand);

        // 响应成功标识
        res.getWriter().write("success");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
