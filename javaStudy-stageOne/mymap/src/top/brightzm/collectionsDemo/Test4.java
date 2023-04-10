package top.brightzm.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringJoiner;

/**
 * @description:
 * @author: bright
 * @time: 2023/3/29 下午2:57
 */
public class Test4 {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"合肥","芜湖","六安","蚌埠");

        ArrayList<String> list2= new ArrayList<>();
        Collections.addAll(list2,"南京","常州","无锡","苏州");

        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"杭州","萧山","绍兴");

        map.put("安徽",list1);
        map.put("江苏",list2);
        map.put("浙江",list3);

        map.forEach( (k,v) -> {
            StringJoiner sj = new StringJoiner(",","","");
            for (String s : v) {
                sj.add(s);
            }
            System.out.println(k + "=" + sj);
        });



    }


}
