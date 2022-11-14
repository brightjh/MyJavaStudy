package top.brightzm.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        // map常用方法演示
        Map<String, Integer> persons = new HashMap<>();

        // Map添加元素
        persons.put("张三", 23);
        persons.put("李四", 24);
        persons.put("王五", 25);
        persons.put("赵六", 26);

        // map覆盖元素
        Integer value = persons.put("赵六", 25);
        System.out.println(value);

        // 根据键删除元素
        System.out.println(persons.remove("王五"));

        // 移除所有的键值对元素
        // persons.clear();

        // 判断集合是否包含指定的键
        System.out.println(persons.containsKey("张三"));
        System.out.println(persons.containsKey("lisi"));

        // 判断集合是否包含指定的值
        System.out.println(persons.containsValue(26));
        System.out.println(persons.containsValue(18));

        // 判断集合是否为空
        System.out.println(persons.isEmpty());

        // 查看集合的长度
        System.out.println(persons.size());

        System.out.println(persons);

    }

}
