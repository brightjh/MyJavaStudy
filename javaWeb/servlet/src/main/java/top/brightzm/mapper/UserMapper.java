package top.brightzm.mapper;

import org.apache.ibatis.annotations.Param;
import sun.security.util.Password;
import top.brightzm.pojo.User;

import java.util.List;

public interface UserMapper {
    User select(@Param("username") String username, @Param("password") String password);

    User selectByName(@Param("username") String username);

    void add(User user);

}
