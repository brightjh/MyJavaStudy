package top.brightzm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.brightzm.domain.Book;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/23 下午10:40
 */
@Mapper
public interface BookDao {

    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);
}
