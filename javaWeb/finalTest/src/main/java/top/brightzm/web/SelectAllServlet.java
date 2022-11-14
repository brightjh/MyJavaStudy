package top.brightzm.web;

import com.alibaba.fastjson.JSON;
import top.brightzm.pojo.Brand;
import top.brightzm.service.BrandService;
import top.brightzm.service.impl.BrandServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/26 下午11:21
 */

@WebServlet("/selectAllServlet")
public class SelectAllServlet extends HttpServlet {

    private BrandService service = new BrandServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 调用查询结果
        List<Brand> brands = service.selectAllBrand();

        // 转为json
        String jsonString = JSON.toJSONString(brands);

        // 返回数据
        res.setContentType("text/json;charset=utf-8");
        res.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
