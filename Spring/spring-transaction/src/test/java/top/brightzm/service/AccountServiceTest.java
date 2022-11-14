package top.brightzm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.brightzm.config.SpringConfig;
import top.brightzm.domain.Account;

import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/7 下午7:16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void testTransfer() throws IOException{
        accountService.transferMoney("zhangsan","lisi",1000D);
    }

    @Test
    public void selectAll(){
        List<Account> accounts = accountService.selectAll();
        System.out.println(accounts);
    }
}
