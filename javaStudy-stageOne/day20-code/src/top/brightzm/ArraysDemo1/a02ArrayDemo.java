package top.brightzm.ArraysDemo1;

import java.util.Arrays;
import java.util.Comparator;

public class a02ArrayDemo {
    public static void main(String[] args) {
        // Array sort自定义方法
        Integer[] arr = {4, 3, 5, 2, 6, 1, 7, 9, 8};

        Arrays.sort(arr, new Comparator<Integer>() {
            // o1 表示无序列表遍历到的数据， o2表示有序列表查询到要对比的数据的数据
            // 返回值是正数 表示 o1比02大，放在后面
            // 返回值是负数 表示0o1比o2小，放在前面
            // 0 表示一样，放在后面

            // o1-o2 升序排序
            // o2-o1 降序排序


            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arr));
    }

}
