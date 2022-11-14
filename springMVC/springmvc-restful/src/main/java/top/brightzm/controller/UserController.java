package top.brightzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.brightzm.domain.User;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/10 下午5:07
 */
@Controller
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String getAll() {
        System.out.println("user getAll");
        return "{'users':'getAll'}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable("id") Integer id) {
        System.out.println("user getById " + id);
        return "{'users':'getById'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody User user) {
        System.out.println("user update" + user);
        return "{'users':'update'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String save(@RequestBody User user) {
        System.out.println("user save" + user);
        return "{'users':'save'}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable("id") Integer id) {
        System.out.println("user delete" + id);
        return "{'users':'delete'}";
    }

}
