package top.brightzm.myArrayListDemo;

import java.util.ArrayList;

public class ListUtil01Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtil01.addAll(list,"aaa","bbb","ccc","ddd");
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        ListUtil01.addAll(list1,1,2,3,4);
        System.out.println(list1);

    }

}
