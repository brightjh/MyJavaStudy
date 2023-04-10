package top.brightzm.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        // 通过键值对遍历数组
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 23);
        map.put("李四", 24);
        map.put("王五", 25);
        map.put("赵六", 26);

        // 获取entry对象的单列集合.在获取key和value

        // 增强for
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        /*for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }*/

        // 迭代器
        /*Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }*/

        // lambda表达式
        entries.forEach(entry ->
                System.out.println(entry.getKey() + "=" + entry.getValue())
        );


    }

}
