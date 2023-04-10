package top.brightzm.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo04 {
    public static void main(String[] args) {
        // Map集合 lambda表达式遍历

        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 23);
        map.put("李四", 24);
        map.put("王五", 25);
        map.put("赵六", 26);

        map.forEach((String key, Integer value) ->
                System.out.println(key + "=" + value)
        );



    }

}
