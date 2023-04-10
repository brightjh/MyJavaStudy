package top.brightzm.ergodic;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: map集合lambda遍历
 * @author: bright
 * @time: 2022/11/27 下午6:35
 */
public class MapDemo3 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("zhangsan", 23);
        map.put("lisi", 24);
        map.put("wangwu", 25);

        /*map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + "=" + integer);
            }
        });*/

        map.forEach((key, value) -> System.out.println(key + "=" + value));


    }

}
