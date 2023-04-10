package top.brightzm.RegexDemo;

import java.util.Scanner;

public class RegexTest1 {
    public static void main(String[] args) {
        // 判断手机号 邮箱号 座机号是否满足要求
        Scanner sc = new Scanner(System.in);

        // 编写正则表达式
        // 第一位为1 第二位3~9 后面全都是数字
        String regex1 = "1[3-9]\\d{9}";


        // 手机号码
        while (true) {
            System.out.println("请输入手机号");
            String number = sc.next();
            if (number.matches(regex1)){
                System.out.println("手机号符合要求");
                break;
            }
            System.out.println("手机号不满足要求");
        }

        // 区号: 第一位为0
        //     第二位开始是任意数字,长度2~3
        // 分割符: - 也可以没有
        // 号码: 第一位不能是0,第二位开始是任意数字 长度5-10
        String regex2 = "0\\d{2,3}-?[^0]\\d{4,9}";

        while (true) {
            System.out.println("请输入座机号");
            String numberend = sc.next();
            if (numberend.matches(regex2)){
                System.out.println("座机号符合要求");
                break;
            }
            System.out.println("不符合要求");
        }


        // 判断邮箱号
        // @左边 任意字母加下划线,至少出现一次
        // @ 只出现一次
        // @右边  1-2次
        //  .的左边 任意字母加数字 2-6次
        //  .
        //  . 的右边 大写小写字母都可以 2-3 次

        String regex3 = "\\w+@([\\w[^_]]{2,6}\\.[A-Za-z]{2,3}){1,2}";

        while (true) {
            System.out.println("输入邮箱号");
            String email = sc.next();
            if (email.matches(regex3)){
                System.out.println("邮箱号正确");
                break;
            }
            System.out.println("邮箱号错误");
        }

        // 24小时
        String regex4 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";

    }


}
