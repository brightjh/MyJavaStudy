package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 将阿拉伯数字转为罗马数字
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("输入数字");
            str = new String(sc.next());
            boolean result = check(str);
            if (result) {
                break;
            } else {
                System.out.println("请重新输入");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = (byte)c - 48;
            sb.append(changToRoma(number));
        }
        String string = sb.toString();
        System.out.println(string);

    }

    // 判断数据合法性
    public static boolean check(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cha = str.charAt(i);
            if (cha < '0' || cha > '9') {
                return false;
            }
        }
        return true;
    }

    // 替换成罗马数字
    public static String changToRoma(int number) {
        String[] array = {"", " I ", " II ", " III ", " IV ", " V ", " VI ", " VII ", " VIII ", " IX"};
        return array[number];
    }
}
