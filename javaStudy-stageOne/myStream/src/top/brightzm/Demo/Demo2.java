package top.brightzm.Demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: bright
 * @time: 2023/3/29 下午8:43
 */
public class Demo2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("aaa",111);
        map.put("bbb",222);
        map.put("ccc",333);
        map.put("ddd",444);

        // 获取stream流
        map.keySet().stream().forEach(System.out::println);
        map.entrySet().stream().forEach(System.out::println);

    }

}
