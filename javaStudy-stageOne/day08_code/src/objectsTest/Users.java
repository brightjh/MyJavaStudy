package objectsTest;

import java.util.Scanner;

public class Users {
    private String userName;
    private String password;
    private String email;
    private String gender;
    private int age;

    // ==构造方法
    public Users() {
        this.userName = null;
        this.password = null;
        this.email = null;
        this.gender = null;
        this.age = 0;
    }

    public Users(String userName, String password, String email, String gender, int age) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    Scanner sc = new Scanner(System.in);

    public void setUserName() {
        System.out.println("输入用户名");
        this.userName = sc.next();
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword() {
        while (true) {
            System.out.println("输入密码");
            String tempPassword = sc.next();
            System.out.println("确认密码");
            String passwordAgain = sc.next();
            if (tempPassword==passwordAgain) {
                this.password = passwordAgain;
                break;
            }else {
                System.out.println("密码不一致");
            }
        }
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


