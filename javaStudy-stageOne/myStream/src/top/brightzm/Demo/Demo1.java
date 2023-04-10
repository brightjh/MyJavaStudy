package top.brightzm.Demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description:
 * @author: bright
 * @time: 2023/3/29 下午4:30
 */
public class Demo1 {

    public static void main(String[] args) {
        /*ArrayList<String> list = new ArrayList<>();
        list.add("刘培强");
        list.add("刘华强");
        list.add("张鹏");
        list.add("韩朵朵");
        list.add("郝晓希");
        list.add("周赭直");
        list.add("刘启");
        list.add("图衡宇");
        list.add("马兆鸥");*/

        ArrayList<String> strings = new ArrayList<>();

        Collections.addAll(strings,"a","s","d","f","g","h");

        strings.stream().forEach(s -> System.out.println(s));








    }
}
