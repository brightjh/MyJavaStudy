package StringTest;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        String rightUsername = "admin";
        String rightPassword = "password";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            boolean nameCheck = rightUsername.equals(username);
            boolean passwordCheck = rightPassword.equals(password);
            if (nameCheck && passwordCheck) {
                System.out.println("登录成功");
                break;
            } else {
                if (i==2) {
                    System.out.println("账户已被锁定,请联系管理员");
                }else {
                    System.out.println("用户名或密码错误,还剩下"+(2-i)+"次机会");
                }

            }
        }

    }
}
