package top.brightzm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.brightzm.dao.AccountDao;
import top.brightzm.domain.Account;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/1 上午12:02
 */
@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public void save(Account account) {
        accountDao.save(account);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }

    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
