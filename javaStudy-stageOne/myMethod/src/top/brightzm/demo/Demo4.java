package top.brightzm.Demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: 转换为大写
 * @author: bright
 * @time: 2023/4/2 下午12:51
 */
public class Demo4 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"aaa","bbb","ccc","ddd");

        /*list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);*/

        list.stream().map(String::toUpperCase).forEach(System.out::println);


    }

}
