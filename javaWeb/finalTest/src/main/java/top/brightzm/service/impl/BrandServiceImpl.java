package top.brightzm.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.brightzm.mapper.BrandMapper;
import top.brightzm.pojo.Brand;
import top.brightzm.pojo.PageBean;
import top.brightzm.service.BrandService;
import top.brightzm.util.SqlSessionFactoryUtils;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/27 下午1:09
 */
public class BrandServiceImpl implements BrandService {

    // 获取sqlSessionFactory实体对象
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Brand> selectAllBrand() {
        // 创建sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取mapper调用查询方法
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        List<Brand> brands = mapper.selectAll();

        // 释放资源并返回数据
        sqlSession.close();

        return brands;
    }

    @Override
    public void addBrand(Brand brand) {
        // 创建sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取mapper调用增加方法
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.addBrand(brand);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public Brand selectById(Integer id) {
        // 获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取mapper对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = mapper.selectById(id);

        sqlSession.close();

        return brand;
    }

    @Override
    public void update(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.update(brand);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteByIds(Integer[] ids) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.deleteByIds(ids);

        sqlSession.commit();

        sqlSession.close();
    }

    @Override
    public PageBean<Brand> selectByPage(int currentPage, int pageSize) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        // 计算开始索引
        int begin = (currentPage - 1) * pageSize;

        // 查询brand数组
        List<Brand> brands = mapper.selectByPage(begin, pageSize);

        // 查询总数
        int totalCount = mapper.selectTotalCount();

        // 封装数据
        PageBean<Brand> pageBean = new PageBean<>(totalCount, brands);

        sqlSession.close();

        return pageBean;
    }

    @Override
    public PageBean<Brand> selectByPageAndCondition(int currentPage, int pageSize, Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        // 计算开始索引
        int begin = (currentPage - 1) * pageSize;

        // 处理数据 模糊表达式
        String brandName = brand.getBrandName();
        if (brandName != null && brandName.length() > 0) {
            brand.setBrandName("%" + brandName + "%");
        }
        String companyName = brand.getCompanyName();
        if (companyName != null && companyName.length() > 0){
            brand.setCompanyName("%" + companyName + "%");
        }
        // System.out.println(brand);

        // 调用查询方法
        List<Brand> brands = mapper.selectByPageAndCondition(begin, pageSize,brand);

        int totalCount = mapper.selectTotalCountByCondition(brand);

        // 封装数据
        PageBean<Brand> pageBean = new PageBean<>(totalCount, brands);

        sqlSession.close();

        return pageBean;

    }


}
