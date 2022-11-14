package StringTest;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNumber = "";
        while (true) {
            phoneNumber = sc.next();
            if (phoneNumber.length() != 11) {
                System.out.println("你找茬是不是");
            } else {
                break;
            }
        }
        String start = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);


    }

    // 将手机号中间四位屏蔽 基础方法
    /*public static String getNewNumber(String number){
        String newNumber = "";
        for (int i = 0; i < number.length(); i++) {
            if (i>=3 && i<=6) {
                newNumber = newNumber + "*";
            }else {
                newNumber = newNumber+number.charAt(i);
            }
        }
        return newNumber;

    }*/


}
