package test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
//        打乱字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        str = upset(str);
        System.out.println(str);



    }

    // 打乱字符串
    public static String upset(String str){
        char[] array = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            char temp = array[i];
            int randomIndex = r.nextInt(array.length);
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return new String(array);
    }

}
