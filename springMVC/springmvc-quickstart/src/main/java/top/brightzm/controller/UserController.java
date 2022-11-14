package top.brightzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/8 下午3:33
 */
@Controller
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("springmvc save...");
        return "{'mvc'}:{'save'}";
    }

}
