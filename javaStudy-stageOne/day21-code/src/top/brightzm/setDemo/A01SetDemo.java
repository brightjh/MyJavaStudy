package top.brightzm.setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01SetDemo {
    public static void main(String[] args) {
        // set集合练习， 添加字符串，并使用多种方法遍历

        // 1.创建一个set集合
        Set<String> s = new HashSet<>();

        // 2.添加元素
        boolean r1 = s.add("Java");
        boolean r2 = s.add("是");
        boolean r3 = s.add("世界上");
        boolean r4 = s.add("最受欢迎的");
        boolean r5 = s.add("语言");
        boolean r6 = s.add("语言");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        // 无序遍历
        System.out.println(s);
        System.out.println("========================");

        // 迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("========================");

        // 增强for
        for (String str :s){
            System.out.println(str);
        }
        System.out.println("=========================");

        // lambda表达式
        s.forEach(str -> System.out.println(str));

    }

}
