package top.brightzm.web;

import com.alibaba.fastjson.JSON;
import top.brightzm.pojo.Brand;
import top.brightzm.service.BrandService;
import top.brightzm.service.impl.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/26 下午11:46
 */

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {

    BrandService service = new BrandServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 接受请求数据体json数据
        BufferedReader reader = req.getReader();
        String json = reader.readLine();

        // 将json转为brand对象
        Brand brand = JSON.parseObject(json, Brand.class);

        service.addBrand(brand);

        // 返回成功数据
        res.getWriter().write("success");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
