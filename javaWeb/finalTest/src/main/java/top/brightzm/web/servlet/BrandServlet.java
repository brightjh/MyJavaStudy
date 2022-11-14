package top.brightzm.web.servlet;

import com.alibaba.fastjson.JSON;
import top.brightzm.pojo.Brand;
import top.brightzm.pojo.PageBean;
import top.brightzm.service.BrandService;
import top.brightzm.service.impl.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/27 下午4:43
 */
@WebServlet("/brand/*")
public class BrandServlet extends BaseServlet{

    private BrandService service = new BrandServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 调用查询结果
        List<Brand> brands = service.selectAllBrand();

        // 转为json
        String jsonString = JSON.toJSONString(brands);

        // 返回数据
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void add(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        // 接受请求数据体json数据
        BufferedReader reader = req.getReader();
        String json = reader.readLine();

        // 将json转为brand对象
        Brand brand = JSON.parseObject(json, Brand.class);

        service.addBrand(brand);

        // 返回成功数据
        resp.getWriter().write("success");

    }

    public void deleteByIds(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
        // 接收前端传来的Json数据
        BufferedReader reader = req.getReader();
        String jsonStr = reader.readLine();

        // 将json转为integer数组
        Integer[] ids = JSON.parseObject(jsonStr, Integer[].class);

        // 调用service方法
        service.deleteByIds(ids);

        // 返回成功数据
        resp.getWriter().write("success");

    }

    /**
     * 分页查询
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void selectByPage(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
        // 接收数据
        String _currentPage = req.getParameter("currentPage");
        String _pageSize = req.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);


        // 查询数据
        PageBean<Brand> pageBean = service.selectByPage(currentPage, pageSize);

        String jsonString = JSON.toJSONString(pageBean);

        // 返回数据
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);

    }

    /**
     * 分页条件查询
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void selectByPageAndCondition(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
        // 接收brand对象
        BufferedReader reader = req.getReader();
        String jsonStr = reader.readLine();
        Brand brand = JSON.parseObject(jsonStr, Brand.class);
        // System.out.println(brand);

        // 接收分页数据
        String _currentPage = req.getParameter("currentPage");
        String _pageSize = req.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);


        // 查询数据
        PageBean<Brand> pageBean = service.selectByPageAndCondition(currentPage, pageSize,brand);

        String jsonString = JSON.toJSONString(pageBean);

        // 返回数据
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void update(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
        // 接收brand对象
        String jsonStr = req.getReader().readLine();

        // 转为brand对象
        Brand brand = JSON.parseObject(jsonStr, Brand.class);

        // 调用修改方法
        service.update(brand);

        // 返回成功信息
        resp.getWriter().write("success");

    }




}
