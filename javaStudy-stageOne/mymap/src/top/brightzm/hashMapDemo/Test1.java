package top.brightzm.hashMapDemo;

import top.brightzm.hashMapDemo.domain.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 存储学生对象并遍历
 * @author: bright
 * @time: 2022/11/27 下午7:14
 */
public class Test1 {

    public static void main(String[] args) {

        Map<Student,String> map = new HashMap<>();
        map.put(new Student("zhangsan",23),"beijing");
        map.put(new Student("lisi",24),"shanghai");
        map.put(new Student("wangwu",25),"nanjing");
        // map.put(new Student("zhangsan",25),"hefei");
        map.put(new Student("zhangsan",23),"wuxi");

        map.forEach((key,value) -> System.out.println(key + "=" + value));
    }

}
