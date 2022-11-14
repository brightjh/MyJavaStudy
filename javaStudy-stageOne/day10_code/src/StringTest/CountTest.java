package StringTest;

import java.util.Scanner;

public class CountTest {
    public static void main(String[] args) {
        // 获取字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        // 定义计数器
        int bigLetterCount = 0;
        int smallLetterCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char cha = str.charAt(i);
            if (cha >= 'A' && cha <= 'Z') { // char类型参与计算时自动转为int类型,ascii表
                bigLetterCount++;
            } else if (cha >= 'a' && cha <= 'z') {
                smallLetterCount++;
            } else if (cha >= '0' && cha <= '9') {
                numberCount++;
            } else {
                System.out.println("字符串不正确");
            }
        }
        System.out.println(bigLetterCount);
        System.out.println(smallLetterCount);
        System.out.println(numberCount);


    }
}
