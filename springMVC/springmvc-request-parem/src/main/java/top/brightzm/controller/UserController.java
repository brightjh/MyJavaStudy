package top.brightzm.controller;

import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.brightzm.domain.User;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/8 下午10:50
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/save")
    @ResponseBody
    public String save(String name, Integer age) {
        System.out.println("save.. name:" + name);
        System.out.println("save.. age:" + age);
        return "{'user':'save'}";
    }

    @RequestMapping("/differentName")
    @ResponseBody
    public String differentName(@RequestParam("name") String Username, Integer age) {
        System.out.println("save.. name:" + Username);
        System.out.println("save.. age:" + age);
        return "{'user':'differentName'}";
    }

    @RequestMapping("/getpojo")
    @ResponseBody
    public String getPojo(User user) {
        System.out.println(user);
        return "{'user':'getPojo'}";
    }

    @RequestMapping("/getstrings")
    @ResponseBody
    public String getStrings(String[] likes) {
        for (String like : likes) {
            System.out.println(like);
        }
        return "{'user':'getStrings'}";
    }

    @RequestMapping("/getList")
    @ResponseBody
    public String getList(@RequestParam List<String> likes) {
        System.out.println(likes);
        return "{'user':'getList'}";
    }

    @RequestMapping("/getListForJson")
    @ResponseBody
    public String getListForJson(@RequestBody List<String> likes) {
        System.out.println(likes);
        return "{'user':'getJson'}";
    }

    @RequestMapping("/getObject")
    @ResponseBody
    public String getObjectForJson(@RequestBody User user) {
        System.out.println(user);
        return "{'user':'getObject'}";
    }

    @RequestMapping("/getObjectList")
    @ResponseBody
    public String getListObjectForJson(@RequestBody List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
        return "{'user':'getListObject'}";
    }

    @RequestMapping("/getDate")
    @ResponseBody
    public String getDate(Date date1,
                          @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2,
                          @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date3
    ) {
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        return "{'user','getDate'}";
    }

    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回json对象");
        User user = new User();
        user.setName("tjh");
        user.setAge(21);
        return user;
    }

    @RequestMapping("/toJsonPOJOList")
    @ResponseBody
    public List<User> toJsonPOJOList(){
        System.out.println("返回json对象数组");
        User user1 = new User();
        user1.setName("zhangsan");
        user1.setAge(23);
        User user2 = new User();
        user2.setName("lisi");
        user2.setAge(24);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        return users;
    }


}
