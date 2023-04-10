package StringTest;

import java.util.Scanner;

public class ReverseStringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串");
        String str = sc.next();
        str = reverse(str);
        System.out.println(str);

    }

    public static String reverse(String str) {
        String newString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }
        return newString;


    }


}
