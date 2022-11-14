package top.brightzm.mapper;


import org.apache.ibatis.session.SqlSession;
import top.brightzm.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    User selectById(int id);


}
