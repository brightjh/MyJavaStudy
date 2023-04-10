package top.brightzm.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: 将年龄大于等于24的人 收集到map集合中
 * @author: bright
 * @time: 2023/3/31 下午12:46
 */
public class Test2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三,23","李四,24","王五,25");

        Map<String, Integer> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));


        System.out.println(map);
    }


}
