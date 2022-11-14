package top.brightzm.service;

import top.brightzm.pojo.Brand;
import top.brightzm.pojo.PageBean;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/26 下午11:05
 */
public interface BrandService {



    /**
     * 查询所有品牌
     * @return
     */
    List<Brand> selectAllBrand();

    /**
     * 添加品牌
     * @param brand
     */
    void addBrand(Brand brand);

    /**
     * 通过id查询brand
     * @param id
     * @return
     */
    Brand selectById(Integer id);


    /**
     * 编辑信息
     * @param brand
     */
    void update(Brand brand);

    /*
     * 删除数据
     * */
    void deleteByIds(Integer[] ids);


    /**
     * 分页查询
     * @param currentPage 当前页码
     * @param pageSize 查询页数
     * @return
     */
    PageBean<Brand> selectByPage(int currentPage,int pageSize);

    /**
     * 条件分页查询
     * @param currentPage
     * @param pageSize
     * @param brand
     * @return
     */
    PageBean<Brand> selectByPageAndCondition(int currentPage,int pageSize,Brand brand);



}
