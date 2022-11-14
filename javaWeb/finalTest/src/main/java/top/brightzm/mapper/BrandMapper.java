package top.brightzm.mapper;

import org.apache.ibatis.annotations.*;
import top.brightzm.pojo.Brand;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/26 下午10:35
 */
public interface BrandMapper {

    /**
     * 查询全部数据
     *
     * @return
     */
    @Select("SELECT * FROM tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();


    /**
     * 通过Id查询brand
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM tb_brand WHERE id=#{id}")
    @ResultMap("brandResultMap")
    Brand selectById(Integer id);

    /**
     * 增加品牌
     *
     * @param brand
     */
    @Insert("INSERT INTO tb_brand value (null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    @ResultMap("brandResultMap")
    void addBrand(Brand brand);

    /**
     * 修改品牌数据
     *
     * @param brand
     */
    @Update("UPDATE tb_brand SET brand_name=#{brandName},company_name=#{companyName},ordered=#{ordered},description=#{description},status=#{status} WHERE id=#{id}")
    @ResultMap("brandResultMap")
    void update(Brand brand);


    /**
     * 批量删除数据
     *
     * @param ids
     */
    void deleteByIds(@Param("ids") Integer[] ids);

    /**
     * 分页查询
     * @param begin
     * @param size
     * @return
     */
    @Select("SELECT * FROM tb_brand LIMIT #{begin},#{size}")
    @ResultMap("brandResultMap")
    List<Brand> selectByPage(@Param("begin") int begin,@Param("size") int size);


    @Select("SELECT count(*) FROM tb_brand")
    int selectTotalCount();


    List<Brand> selectByPageAndCondition(@Param("begin") int begin,@Param("size") int size,@Param("brand") Brand brand);

    int selectTotalCountByCondition(Brand brand);

}
