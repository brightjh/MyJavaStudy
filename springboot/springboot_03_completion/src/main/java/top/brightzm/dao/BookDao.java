package top.brightzm.dao;

import org.apache.ibatis.annotations.*;
import top.brightzm.domain.Book;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/11 下午8:20
 */
@Mapper
public interface BookDao {

    @Select("SELECT * FROM tbl_book")
    List<Book> selectAll();

    @Select("SELECT * FROM tbl_book WHERE id = #{id}")
    Book selectById(Integer id);

    @Insert("INSERT INTO tbl_book VALUES (NULL,#{type},#{name},#{description})")
    void add(Book book);

    @Update("UPDATE tbl_book SET type=#{type}, name=#{name}, description=#{description} WHERE id = #{id}")
    void update(Book book);

    @Delete("DELETE FROM tbl_book WHERE id = #{id} ")
    void del(Integer id);

}
