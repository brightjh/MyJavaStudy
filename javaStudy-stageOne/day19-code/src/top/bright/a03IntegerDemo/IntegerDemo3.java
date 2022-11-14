package top.bright.a03IntegerDemo;

import java.util.Scanner;

public class IntegerDemo3 {
    public static void main(String[] args) {
        // 改进键盘录入
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);
        int i = Integer.parseInt(line);
        System.out.println(i + 1);


    }
}
