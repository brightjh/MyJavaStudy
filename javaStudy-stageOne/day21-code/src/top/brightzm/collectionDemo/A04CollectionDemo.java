package top.brightzm.collectionDemo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class A04CollectionDemo {
    public static void main(String[] args) {
        // lambda表达式遍历
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("------------------");

        // forEach方法遍历每个元素，传递到s
        list.forEach(s -> System.out.println(s));

    }
}
