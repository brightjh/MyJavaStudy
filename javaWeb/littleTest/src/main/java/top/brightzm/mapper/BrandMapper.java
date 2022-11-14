package top.brightzm.mapper;

import org.apache.ibatis.annotations.*;
import top.brightzm.pojo.Brand;

import java.util.List;

public interface BrandMapper {

    // 查询所有品牌
    @Select("SELECT * FROM tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();


    @Insert("INSERT INTO tb_brand VALUES (null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void addBrand(Brand brand);

    @Select("SELECT * FROM tb_brand WHERE id = #{id}")
    @ResultMap("brandResultMap")
    Brand selectById(Integer id);

    /*
    * 修改数据
    * */
    @Update("UPDATE tb_brand SET brand_name = #{brandName},company_name=#{companyName},ordered=#{ordered},description=#{description},status=#{status} WHERE id = #{id}")
    @ResultMap("brandResultMap")
    void updateBrand(Brand brand);

    /*
    * 删除数据
    * */
    void deleteByIds(@Param("ids") Integer[] ids);


}
