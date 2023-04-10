package top.brightzm.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @description: stream 处理
 * @author: bright
 * @time: 2023/3/30 上午8:56
 */
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"刘培强","刘华强","刘培强","刘培强","张鹏","韩朵朵","郝晓希","周赭直",
                "刘启","图衡宇", "马兆鸥");

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"图衡宇", "图丫丫");

        // 去重
        //list.stream().distinct().forEach(System.out::println);

        Stream.concat(list.stream(),list1.stream()).forEach(System.out::println);

    }
}
