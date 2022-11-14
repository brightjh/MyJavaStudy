package top.brightzm.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.brightzm.domain.Account;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/7 下午6:45
 */
public interface AccountDao {

    @Update("UPDATE tbl_account SET money = money + #{money} WHERE name = #{name}")
    void inMoney(@Param("name") String name, @Param("money") Double money);

    @Update("UPDATE tbl_account SET money = money - #{money} WHERE name = #{name}")
    void outMoney(@Param("name") String name,@Param("money") Double money);

    @Select("SELECT * FROM tbl_account")
    List<Account> selectAll();

}
