package top.brightzm.Demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: stream处理
 * @author: bright
 * @time: 2023/3/30 上午8:08
 */
public class Demo3 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"刘培强","刘华强","张鹏","韩朵朵","郝晓希","周赭直",
                "刘启","图衡宇", "马兆鸥");

        /*list.stream()
                .filter(s -> s.startsWith("刘"))
                .filter(s -> s.length() == 3)
                .forEach(System.out::println);*/

        /*list.stream()
                .limit(3)
                .forEach(System.out::println);*/

        list.stream()
                .skip(3)
                .forEach(System.out::println);




    }

}
