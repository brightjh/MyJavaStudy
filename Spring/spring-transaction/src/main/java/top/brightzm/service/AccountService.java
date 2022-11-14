package top.brightzm.service;

import org.springframework.transaction.annotation.Transactional;
import top.brightzm.domain.Account;

import javax.swing.plaf.PanelUI;
import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/7 下午6:51
 */
public interface AccountService {

    @Transactional
    public void transferMoney(String out,String in,Double money);

    public List<Account> selectAll();

}
