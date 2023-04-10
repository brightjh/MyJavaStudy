package top.brightzm.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: 过滤奇数,保留偶数
 * @author: bright
 * @time: 2023/3/31 上午10:42
 */
public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        List<Integer> collect = list.stream().filter(integer -> (integer % 2) == 0).collect(Collectors.toList());

        System.out.println(collect);



    }

}
