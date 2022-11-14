package top.brightzm.mapper;

import org.apache.ibatis.annotations.Param;
import top.brightzm.pojo.Brand;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    List<Brand> selectAll(); // 查询所有

    // 注解开发

    Brand selectById(int id); // 根据id查询，查看详情


    // 散装参数：如果有多个参数，需要使用@Param(sql语句占位符名称)
    List<Brand> selectByCondition(@Param("status") int status,@Param("companyName") String companyName,@Param("brandName") String brandName);// 根据条件查询
    // 对象参数：对象内的参数属性需要和sql占位符名称相同
    List<Brand> selectByCondition(Brand brand); // 根据brand对象查询
    // map集合参数：集合内键的名称需要和占位符名称相同
    List<Brand> selectByCondition(Map map); // 根据map集合查询

    // 单条件动态查询
    List<Brand> selectByConditionSingle(Brand brand);

    // 添加
    void addAll(Brand brand);

    void updateAll(Brand newBrand);

    void updateByCondition(Brand newBrand);

    void delOneById(Integer id);

    void delManyByIds(@Param("ids") Integer[] ids);


}
