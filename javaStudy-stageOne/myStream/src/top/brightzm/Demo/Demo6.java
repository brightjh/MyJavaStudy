package top.brightzm.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

/**
 * @description:
 * @author: bright
 * @time: 2023/3/30 上午9:29
 */
public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"刘培强","刘华强","刘培强","刘培强","张鹏","韩朵朵","郝晓希","周赭直",
                "刘启","图衡宇", "马兆鸥");

        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        System.out.println(Arrays.toString(arr));


    }
}
