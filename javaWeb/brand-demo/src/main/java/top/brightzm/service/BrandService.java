package top.brightzm.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.brightzm.mapper.BrandMapper;
import top.brightzm.pojo.Brand;
import top.brightzm.util.SqlSessionFactoryUtils;

import java.util.List;

public class BrandService {

    // 获取sqlSessionFactory对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /*
    * 查询所有品牌
    * */

    public List<Brand> selectAll(){

        // 获取sqlSession
        SqlSession sqlSession = factory.openSession();
        // 调用Mapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        // 调用方法
        List<Brand> brands = mapper.selectAll();

        sqlSession.close();

        return brands;
    }

    /*
    * 添加
    * */
    public void addBrand(Brand brand){
        // 获取sqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取mapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        // 调用方法
        mapper.addBrand(brand);
        // 提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    /*
    * 通过id查询
    * */
    public Brand selectById(Integer id){
        // 获取sqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取mapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        // 调用方法
        Brand brand = mapper.selectById(id);

        sqlSession.close();

        return brand;
    }

    /**
     *
     *修改数据
     */
    public void updateBrand(Brand brand){
        // 获取sqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取mapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        // 调用方法
        mapper.updateBrand(brand);

        // 提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    public  void deleteBrand(Integer id){
        // 获取sqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取mapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        // 调用mapper
        mapper.deleteBrand(id);

        // 调用方法
        sqlSession.commit();

        sqlSession.close();
    }

}
