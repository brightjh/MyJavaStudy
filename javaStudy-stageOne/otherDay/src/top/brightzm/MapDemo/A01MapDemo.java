package top.brightzm.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class A01MapDemo {
    public static void main(String[] args) {
        // Map添加和通过键值查找

        // 创建Student对象
        Student s1 = new Student("zhangsan",89,23);
        Student s2 = new Student("lisi",90,24);
        Student s3 = new Student("wangwu",81,25);
        Student s4 = new Student("zhaoliu",85,26);

        // 创建Map集合
        Map<String,Student> map = new HashMap<>();

        // 将元素添加到map中
        map.put("zhangsan",s1);
        map.put("lisi",s2);
        map.put("wangwu",s3);

        // 通过key查找对象
        System.out.println(map.get("lisi"));

        Student target = map.get("zhangsan");
        System.out.println(target.equals(s1));
        System.out.println(target.getScore());

        // 查找不存在的key
        System.out.println(map.get("zhaoliu"));
        // 判断key是否存在于map中
        System.out.println(map.containsKey("zhaoliu"));
        System.out.println(map.containsKey("wangwu"));
        // 判断value是否在map中
        System.out.println(map.containsValue(s1));
        System.out.println(map.containsValue(s4));

        // 两次存入一样的key值，value会被覆盖
        map.put("wangwu",s4);
        System.out.println(map.get("wangwu"));

        // key值不能重复，value可以重复
        map.put("zhaliu",s4);
        System.out.println(map.get("zhaliu"));

        System.out.println("======================");
        // 遍历map
        // 通过keySet()方法遍历



        for (String key : map.keySet()){
            Student s = map.get(key);
            System.out.println(key+":"+s);
        }


        System.out.println("========================");

        // 通过entrySet方法遍历遍历
        for (Map.Entry<String,Student> entry : map.entrySet()){
            String key = entry.getKey();
            Student s = entry.getValue();
            System.out.println(key+":"+s);
        }

    }




}
