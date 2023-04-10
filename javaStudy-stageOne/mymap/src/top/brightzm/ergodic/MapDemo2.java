package top.brightzm.ergodic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @description: 通过键值对遍历map
 * @author: bright
 * @time: 2022/11/26 下午6:55
 */
public class MapDemo2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("zhangsan", 23);
        map.put("lisi", 24);
        map.put("wangwu", 25);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        // 增强for遍历entries
        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        // 迭代器遍历
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        // lambda表达式遍历
        entries.forEach( entry -> {
                System.out.println(entry.getKey() + "=" + entry.getValue());

        });



    }

}
