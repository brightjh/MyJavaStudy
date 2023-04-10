package top.brightzm.ergodic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @description: map遍历方式 通过键找值
 * @author: bright
 * @time: 2022/11/26 下午4:31
 */
public class MapDemo1 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("zhangsan", 23);
        map.put("lisi", 24);
        map.put("wangwu", 25);

        // 通过键找值
        Set<String> keys = map.keySet();

        // 增强for
        /*for (String key : keys){
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }*/

        // 迭代器
        /*Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }*/

        // lambda表达式
        keys.forEach(key -> {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);

        });


    }

}
