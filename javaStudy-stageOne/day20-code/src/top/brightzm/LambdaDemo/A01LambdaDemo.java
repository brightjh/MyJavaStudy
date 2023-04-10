package top.brightzm.LambdaDemo;

import java.util.Arrays;

public class A01LambdaDemo {
    public static void main(String[] args) {
        // 用lambda表达式简化Arrays的sort


        Integer[] arr = {7, 6, 9, 8, 4, 3, 2, 5, 1};

        Arrays.sort(arr, (Integer o1, Integer o2) ->{
            return o1 - o2;
        }
        );

        System.out.println(Arrays.toString(arr));

    }


}
