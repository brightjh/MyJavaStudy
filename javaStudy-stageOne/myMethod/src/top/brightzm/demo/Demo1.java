package top.brightzm.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description: 引用静态方法
 * @author: bright
 * @time: 2023/4/1 下午8:21
 */
public class Demo1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        // 转为整数

        List<Integer> integers = list.stream().map(Integer::parseInt).toList();
        System.out.println(integers);

    }

}
