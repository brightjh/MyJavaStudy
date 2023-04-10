package top.brightzm.Demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: 获取stream
 * @author: bright
 * @time: 2023/3/29 下午4:30
 */
public class Demo1 {

    public static void main(String[] args) {


        ArrayList<String> strings = new ArrayList<>();

        Collections.addAll(strings,"a","s","d","f","g","h");

        strings.stream().forEach(s -> System.out.println(s));








    }
}
