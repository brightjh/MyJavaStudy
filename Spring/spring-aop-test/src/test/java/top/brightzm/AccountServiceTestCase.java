package top.brightzm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.brightzm.config.SpringConfig;
import top.brightzm.domain.Account;
import top.brightzm.service.AccountService;

import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/3 下午10:41
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTestCase {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById(){
        Account ac = accountService.findById(2);
    }

    @Test
    public void testFindAll(){
        List<Account> all = accountService.findAll();
    }

}
