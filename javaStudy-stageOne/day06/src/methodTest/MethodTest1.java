package methodTest;

import java.util.Scanner;

public class MethodTest1 {
    public static void main(String[] args) {
//        计算长方形的周长
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        Long(width, height);
    }

    public static void Long(int width, int height) {
        int result = (width + height) * 2;
        System.out.println(result);
    }

}
