package top.brightzm.myArrayListDemo;

import java.util.ArrayList;

public class ListUtil01 { // 工具类
    private ListUtil01(){}


    // 泛型方法
    public static<E> void addAll(ArrayList<E> list,E e1,E e2,E e3,E e4){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }



}