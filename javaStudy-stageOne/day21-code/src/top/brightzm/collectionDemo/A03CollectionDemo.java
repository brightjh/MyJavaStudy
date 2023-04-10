package top.brightzm.collectionDemo;

import java.util.ArrayList;

public class A03CollectionDemo {
    public static void main(String[] args) {
        // 增强for循环
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        // 增强for遍历，本质上还是迭代器（iterator）
        for (String str : list){
            System.out.println(str);
        }



    }


}
