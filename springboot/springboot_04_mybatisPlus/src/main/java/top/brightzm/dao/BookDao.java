package top.brightzm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.brightzm.domain.Book;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/24 下午10:38
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
