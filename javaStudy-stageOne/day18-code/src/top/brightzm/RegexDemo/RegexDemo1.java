package top.brightzm.RegexDemo;

import java.util.Scanner;

public class RegexDemo1 {
    public static void main(String[] args) {
        // 判断QQ号是否正确
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入QQ号");
            String number = sc.next();
            // boolean result = containsNumber(number);
            boolean result = number.matches("[1-9]\\d{5,19}");
            if (result){
                System.out.println("QQ号正确");
                break;
            }
            System.out.println("QQ号错误,请重新输入");
        }



    }

    // 旧方法
    public static boolean containsNumber(String number){
        if (number.startsWith("0")){
            return false;
        }
        int len = number.length();
        if (!(len>=6 && len<=20)){
            return false;
        }
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (!(c>='0' && c<='9')){
                return false;
            }
        }
        return true;
    }

}
