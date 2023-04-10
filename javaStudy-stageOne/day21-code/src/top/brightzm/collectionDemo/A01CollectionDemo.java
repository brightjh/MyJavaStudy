package top.brightzm.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class A01CollectionDemo {
    public static void main(String[] args) {
        // collection的方法

        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("aaa");
        coll.add("bbb");
        System.out.println(coll.toString());

//        coll.clear();
//        System.out.println(coll.toString());

        System.out.println(coll.remove("aaa"));
        System.out.println(coll.toString());

        System.out.println(coll.contains("aaa"));
        System.out.println(coll.contains("ccc"));

        System.out.println(coll.isEmpty());

        /*coll.clear();
        System.out.println(coll.isEmpty());*/

        System.out.println(coll.size());
        coll.add("ccc");
        System.out.println(coll.size());



    }

}
