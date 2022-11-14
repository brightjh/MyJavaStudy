package top.brightzm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.brightzm.dao.AccountDao;
import top.brightzm.domain.Account;
import top.brightzm.service.AccountService;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/7 下午6:52
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transferMoney(String out, String in,Double money) {
        accountDao.outMoney(out,money);
        int i = 1/0;
        accountDao.inMoney(in,money);

    }

    @Override
    public List<Account> selectAll() {
        return accountDao.selectAll();
    }
}
