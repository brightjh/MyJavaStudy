package top.brightzm.listDemo;

import java.util.ArrayList;

public class A01ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        System.out.println(list);

        // 添加元素，在指定位置插如元素，原来索引上的元素会依次向后移
        list.add(3,"fff");
        System.out.println(list);

        // 删除元素，删除指定位置的元素，返回被删除的元素
        System.out.println(list.remove(3));
        System.out.println(list);

        // 修改元素，将指定位置的元素更改为提供的元素，返回被修改的元素
        System.out.println(list.set(2, "CCC"));
        System.out.println(list);

        // 获取元素，获取指定位置的元素
        System.out.println(list.get(4));

    }
}
