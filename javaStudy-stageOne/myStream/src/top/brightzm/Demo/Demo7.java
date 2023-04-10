package top.brightzm.Demo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: bright
 * @time: 2023/3/31 上午9:10
 */
public class Demo7 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"刘培强-男-40","刘华强-男-35","张鹏-男-52","韩朵朵-女-30","郝晓希-女-30",
                "周赭直-男-60", "刘启-男-12","图衡宇-男-50", "马兆鸥-男-50");
        // 转为list
        List<String> newList1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(newList1);

        // 转为set
        Set<String> newList2 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(newList2);

        // 转为map
        /*Map<String, Integer> map = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));*/

        Map<String, Integer> map = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));

        System.out.println(map);

    }


}
