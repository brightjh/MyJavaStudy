package top.brightzm.listDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A02ListDemo2 {
    public static void main(String[] args) {
        // list集合的五种遍历方式

        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        // 1.迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            if (str.equals("bbb")){
                it.remove(); // 删除元素
            }
            System.out.println(str);
        }
        System.out.println("--------------------");

        // 2.列表迭代器遍历
        // 在遍历过程中可以添加元素
        ListIterator<String> listIt = list.listIterator();
        while (listIt.hasNext()){
            String str = listIt.next();
            if (str.equals("ccc")){
                listIt.add("CCC"); // 添加元素
            }
            System.out.println(str);
        }

        System.out.println("--------------------");

        // 3.增强for
        for (String str: list){
            System.out.println(str);
        }
        System.out.println("--------------------");

        // 4.lambda表达式
        list.forEach( s -> System.out.println(s) );
        System.out.println("--------------------");

        // 5.普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
