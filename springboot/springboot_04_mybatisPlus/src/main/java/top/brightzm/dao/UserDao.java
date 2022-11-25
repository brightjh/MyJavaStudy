package top.brightzm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.brightzm.domain.User;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/24 下午3:14
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
