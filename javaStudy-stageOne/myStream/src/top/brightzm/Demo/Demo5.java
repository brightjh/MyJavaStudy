package top.brightzm.Demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: 分割
 * @author: bright
 * @time: 2023/3/30 上午9:02
 */
public class Demo5 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "刘培强-40", "刘华强-30", "张鹏-51", "韩朵朵-30", "郝晓希-30", "周赭直-60",
                "刘启-12", "图衡宇-50", "马兆鸥-50");

        /*list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[1]);
            }
        }).forEach(System.out::println);*/

        list.stream().map( s -> Integer.parseInt(s.split("-")[1])).forEach(System.out::println);


    }
}
