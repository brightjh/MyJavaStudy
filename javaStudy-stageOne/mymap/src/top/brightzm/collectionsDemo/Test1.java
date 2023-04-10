package top.brightzm.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @description:
 * @author: bright
 * @time: 2023/3/28 下午3:39
 */
public class Test1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"好烦","怎么办","找工作","找不到","继续找","加油");

        Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);




    }

}
