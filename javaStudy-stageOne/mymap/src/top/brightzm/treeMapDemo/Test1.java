package top.brightzm.treeMapDemo;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @description:
 * @author: bright
 * @time: 2023/3/26 下午1:34
 */
public class Test1 {

    public static void main(String[] args) {
        TreeMap<Integer,String> goods = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
                // 返回1时 第二个参数排在第一个的前面
                // 0 已经存在
                // -1 第一个参数排前面
            }
        });
        goods.put(1,"car");
        goods.put(2,"book");
        goods.put(3,"computer");
        goods.put(4,"phone");
        goods.put(5,"router");

        System.out.println(goods);


    }

}
