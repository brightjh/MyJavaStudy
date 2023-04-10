package top.brightzm.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        // Map的遍历方式

        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 23);
        map.put("李四", 24);
        map.put("王五", 25);
        map.put("赵六", 26);

        // 键找值

        // 获取所有的键,添加到单列集合中
        Set<String> keys = map.keySet();
        /*// 遍历keys(增强for遍历)
        for (String key : keys) {
            // 通过key获取每一个值
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }*/

        // 迭代器遍历
        /*Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }*/

        // lambda表达式遍历
        keys.forEach(key -> {
                    Integer value = map.get(key);
                    System.out.println(key + "=" + value);
                }
        );




    }
}
