package StringDemo;

import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        // 接受字符串判断是否是对称字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串");
        String str1 = sc.next();
        // 反转字符串
        String str2 = new StringBuilder().append(str1).reverse().toString();

        // 判断
        if (str1.equals(str2)) {
            System.out.println("对称字符串");
        }else {
            System.out.println("非对称字符串");
        }


    }

}
