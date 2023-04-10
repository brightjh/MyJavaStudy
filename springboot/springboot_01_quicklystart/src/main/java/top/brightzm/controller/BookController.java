package top.brightzm.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/22 下午11:04
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public String getBook(@PathVariable String id){
        System.out.println("id=="+id);
        return "hello spring boot";
    }

}
