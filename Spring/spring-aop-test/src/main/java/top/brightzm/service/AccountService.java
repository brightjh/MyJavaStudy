package top.brightzm.service;

import top.brightzm.domain.Account;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/3 下午10:16
 */
public interface AccountService {

    void save(Account account);
    void delete(Integer id);
    void update(Account account);
    List<Account> findAll();
    Account findById(Integer id);

}
