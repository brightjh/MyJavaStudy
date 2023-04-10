package top.brightzm.setDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class A04TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet存储数据并排序

        // 1.创建TreeSet对象
        TreeSet<Integer> ts = new TreeSet<>();

        // 2.添加数据
        ts.add(2);
        ts.add(3);
        ts.add(1);
        ts.add(7);
        ts.add(5);
        ts.add(6);

        // 3.打印TreeSet
        System.out.println(ts);

        // 4.遍历TreeSet
        System.out.println("-------迭代器遍历------");
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-------增强for遍历------");
        for (Integer i : ts) {
            System.out.println(i);
        }

        System.out.println("-------lambda表达式遍历------");
        ts.forEach(i -> System.out.println(i));


    }


}
