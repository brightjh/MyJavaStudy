package top.brightzm.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class A02CollectionDemo {
    public static void main(String[] args) {
        // 迭代器
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        System.out.println(it.next());


    }

}
