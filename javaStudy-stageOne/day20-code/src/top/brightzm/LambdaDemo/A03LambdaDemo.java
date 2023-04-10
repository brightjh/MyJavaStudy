package top.brightzm.LambdaDemo;

import java.util.Arrays;

public class A03LambdaDemo {
    public static void main(String[] args) {
        // lambda表达式的简化书写
        Integer[] array = {3, 5, 2, 4, 1, 9, 7, 8, 6};

        // 基础方式
        /*Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });*/

        // lambda标准书写
        Arrays.sort(array, (Integer o1, Integer o2) -> {
            return o1 - o2;
        });


        // lambda简化书写
        // 1.参数类型可以省略
        // 2.如果只有一个参数，参数类型可以省略，同时（）也可以省略
        // 3.如果lambda表达式只有一行，大括号，分号，return可以省略不写，需要同时省略

        // Arrays.sort(array, (o1, o2) -> o1 - o2);


        System.out.println(Arrays.toString(array));


    }


}
