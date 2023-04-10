package top.brightzm.demo;

import top.brightzm.demo.domain.Users;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: bright
 * @time: 2023/4/1 下午9:50
 */
public class Demo3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Collections.addAll(list,"刘培强-40","刘华强-35","刘启-15","韩朵朵-30","韩子昂-55");

        /*List<Users> users = list.stream().map(new Function<String, Users>() {
            @Override
            public Users apply(String s) {
                return new Users(s.split("-")[0], Integer.parseInt(s.split("-")[1]));
            }
        }).collect(Collectors.toList());*/


        List<Users> users = list.stream().map(Users::new).collect(Collectors.toList());

        System.out.println(users);

    }


}
