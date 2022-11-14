package top.brightzm.LambdaDemo;

import java.util.Arrays;

public class A04LambdaTest {
    public static void main(String[] args) {
        // 定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
        String[] arr = {"Python","是世界上","最","好的","语言"};

        Arrays.sort(arr,(o1,o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));


    }
}
