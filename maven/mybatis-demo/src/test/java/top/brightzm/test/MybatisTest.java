package top.brightzm.test;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import top.brightzm.mapper.BrandMapper;
import top.brightzm.pojo.Brand;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {

    @Test
    public void testSelectAll() throws IOException {
        // brand表测试查询

        //1. 加载mybatis核心配置文件，获取sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取sqlSession对象，执行sql语句
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3.获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4.执行方法
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);

        //  5.释放资源
        sqlSession.close();
    }

    // 根据id查询
    @Test
    public void selectByIdTest() throws IOException {
        // 接受变量
        int id = 2;

        // 1.加载mybatis核心配置文件，获取sqlFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3.获取mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4.执行方法
        Brand brand = brandMapper.selectById(id);
        System.out.println(brand);

        // 5.释放
        sqlSession.close();

    }

    // 根据条件查询
    @Test
    public void selectByConditionTest() throws IOException {
        // 获取用户数据
        // 散装参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        // 封装对象
        /*Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);*/

        // map集合
        Map map = new HashMap();
        // map.put("status", status);
        map.put("companyName", companyName);
        map.put("brandName", brandName);

        // 1.加载mybatis核心配置文件，获取sqlFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3.获取mapper对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4.执行方法
        // 散装参数
        // List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);

        // 对象参数
        // List<Brand> brands = brandMapper.selectByCondition(brand);

        // map参数
        List<Brand> brands = brandMapper.selectByCondition(map);

        System.out.println(brands);

        // 5.释放资源
        sqlSession.close();

    }

    @Test
    public void selectByConditionSingleTest() throws IOException {
        // 获取用户参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        //处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        // 封装参数
        Brand brand = new Brand();
        //brand.setStatus(status);
        //brand.setCompanyName(companyName);
        brand.setBrandName(brandName);

        // 1.加载mybatis核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3.获取mapper对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4.执行方法
        List<Brand> brands = brandMapper.selectByConditionSingle(brand);
        System.out.println(brands);

        // 5.释放资源
        sqlSession.close();

    }

    // 添加品牌
    @Test
    public void addAllTest() throws IOException {
        // 获取用户数据
        String brandName = "apple";
        String companyName = "苹果技术有限公司";
        Integer ordered = 1;
        String description = "苹果信号，助力你的每一场游戏";
        Integer status = 0;

        // 封装数据
        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);
        brand.setStatus(status);

        // 1.加载mybatis配置文件,创建sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream resources = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resources);

        // 2.创建sqlSession,获取mapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 3.执行方法
        brandMapper.addAll(brand);
        // 查询结果
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);
        // 提交事务
        sqlSession.commit();

        System.out.println(brand.getId());

        // 4.释放资源
        sqlSession.close();
    }

    // 修改全部字段数据
    @Test
    public void updateAllTest() throws IOException {
        // 接受用户数据
        Integer updateID = 6;
        String brandName = "google";
        String companyName = "谷歌科技有限公司";
        Integer ordered = 5;
        String description = "谷歌全球领先";
        Integer status = 1;

        // 封装数据
        Brand brand = new Brand();
        brand.setId(updateID);
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);
        brand.setStatus(status);

        // 1.加载mybatis配置文件,创建sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream resources = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resources);

        // 2.创建sqlSession,获取mapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 3.执行方法
        brandMapper.updateAll(brand);

        // 提交事务
        sqlSession.commit();

        // 4.释放资源
        sqlSession.close();

    }

    // 修改部分字段
    @Test
    public void updateByCondition() throws IOException {
        // 接受用户数据
        Integer updateID = 6;
        String brandName = "google";
        String companyName = "谷歌科技有限公司";
        Integer ordered = 5;
        String description = "google一下，你就知道";
        Integer status = 0;

        // 封装数据
        Brand brand = new Brand();
        brand.setId(updateID);
        brand.setBrandName(brandName);
        // brand.setCompanyName(companyName);
        //brand.setOrdered(ordered);
        //brand.setDescription(description);
        //brand.setStatus(status);

        System.out.println(brand);
        // 1.加载mybatis配置文件,创建sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream resources = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resources);

        // 2.创建sqlSession,获取mapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 3.执行方法
        brandMapper.updateByCondition(brand);

        // 提交事务
        sqlSession.commit();

        // 4.释放资源
        sqlSession.close();

    }

    // 根据id删除字段
    @Test
    public void delByIdTest() throws IOException {
        // 接受用户数据
        Integer delID = 7;

        // 1.加载mybatis配置文件,创建sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream resources = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resources);

        // 2.创建sqlSession,获取mapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 3.执行方法
        brandMapper.delOneById(delID);

        // 提交事务
        sqlSession.commit();

        // 4.释放资源
        sqlSession.close();

    }

    // 批量删除
    @Test
    public void delManyByIdsTest() throws IOException {
        // 接收数组
        Integer[] ids = {8, 9, 10, 12};

        // 1.加载mybatis配置文件,创建sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream resources = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resources);

        // 2.创建sqlSession,获取mapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 3.执行方法
        brandMapper.delManyByIds(ids);

        // 提交事务
        sqlSession.commit();

        // 4.释放资源
        sqlSession.close();

    }
}
