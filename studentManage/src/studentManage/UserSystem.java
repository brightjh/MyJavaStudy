package studentManage;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class UserSystem {
    public static void main(String[] args) {
        ArrayList<Users> users = new ArrayList<>();
        System.out.println("欢迎来到学生管理系统");
        loop:
        while (true) {
            System.out.println("请选择操作 1登录 2注册 3忘记密码 4退出");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> login(users);
                case 2 -> register(users);
                case 3 -> forgetPassword(users);
                case 4 -> System.exit(0);
                default -> System.out.println("没有该选项,请重新选择");
            }
        }


    }

    public static void register(ArrayList<Users> users) {
        Scanner sc = new Scanner(System.in);
        // 先创建user对象,在写入数组中
        Users user = new Users();
        // 设置用户名
        String userName;
        while (true) {
            System.out.println("请设置你的用户名");
            userName = sc.next();
            boolean flag1 = checkName(userName);
            if (!flag1) {
                System.out.println("用户名不符合规范");
                continue;
            }
            if (contains(users, userName)) {
                System.out.println("用户名" + userName + "已存在,请重新输入");
            } else {
                break;
            }
//            if (!contains(users, userName)) {  // 判断用户是否存在
//                if (userName.length() >= 3 && userName.length() <= 15) { // 判断用户名长度是否符合要求
//                    if (containsName(userName)) { // 判断用户名是否为字母加数字
//                        break;
//                    } else {
//                        System.out.println("用户名必须是字母加数字,请重新输入");
//                    }
//                } else {
//                    System.out.println("用户名长度不符合,请重新输入");
//                }
//            } else {
//                System.out.println("用户名已存在,请重新输入");
//            }
        }
        user.setUserName(userName); // 保存成功
        System.out.println("用户名设置成功");

        // 设置密码
        String password;
        while (true) {
            System.out.println("请设置你的密码");
            String password1 = sc.next();
            System.out.println("请再次输入你的密码");
            String password2 = sc.next();
            if (password1.equals(password2)) {
                password = password2;
                break;
            } else {
                System.out.println("密码不一致,请重新输入");
            }
        }
        user.setPassword(password);
        System.out.println("密码设置成功");

        // 设置身份证号码
        String id;
        while (true) {
            System.out.println("请输入你的身份证号码");
            id = sc.next();
            boolean flag2 = checkPersonID(id);
            if (flag2) {
                break;
            } else {
                System.out.println("身份证格式不正确,请重新输入");
            }
//            if (id.length() == 18) { // 验证长度
//                if (id.charAt(0) != '0') { // 验证开头是否为0
//                    if (containsID(id)) { // 验证前17位是否全为0,最后一位是否为数字或者x
//                        break;
//                    } else {
//                        System.out.println("身份证不符合规范,请重新输入");
//                    }
//                } else {
//                    System.out.println("证件号不能以0为开头,请重新输入");
//                }
//            } else {
//                System.out.println("身份证号长度不正确,请重新输入");
//            }
        }
        user.setUserID(id);

        // 手机号验证
        String number;
        while (true) {
            System.out.println("请输入你的手机号");
            number = sc.next();
            boolean flag3 = checkNumber(number);
            if (flag3) {
                System.out.println("手机号符合规范");
                break;
            } else {
                System.out.println("手机号不规范,请重新输入");
            }

//            if (number.length() == 11) {
//                if (number.charAt(0) != '0') {
//                    if (containsNumber(number)) {
//                        break;
//                    } else {
//                        System.out.println("手机号必须全为数字,请重新输入");
//                    }
//                } else {
//                    System.out.println("手机号不能以0开头,请重新输入");
//                }
//            } else {
//                System.out.println("手机号长度不正确,请重新输入");
//            }
        }
        user.setPhoneNumber(number);
        System.out.println("手机号保存成功");

        // 将user保存到数组中

        users.add(user);
        System.out.println("注册成功");
        for (int i = 0; i < users.size(); i++) {
            Users u = users.get(i);
            System.out.println("用户名:" + u.getUserName() + " 密码:" + u.getPassword() + " 身份证账号:" + u.getUserID() + " 手机号:" + u.getPhoneNumber());
        }

    }


    public static void login(ArrayList<Users> users) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; true; i++) {
            if (i == 2) {
                System.out.println("登录失败");
                return;
            }
            System.out.println("请输入用户名");
            String name = sc.next();
            if (!(contains(users, name))) {
                System.out.println("用户" + name + "不存在,请注册");
                return;
            }
            System.out.println("请输入密码");
            String password = sc.next();

            while (true) {
                String verificationCode = getVerificationCode();
                System.out.println("验证码:" + verificationCode);
                System.out.println("请输入验证码");
                String intoCode = sc.next();
                if (verificationCode.equalsIgnoreCase(intoCode)) {
                    break;
                } else {
                    System.out.println("验证码错误");
                }
            }
            // 验证用户名密码是否正确
            Users userInfo = new Users(name, password, null, null);
            boolean result = checkLogin(users, userInfo);
            if (result) {
                System.out.println("登录成功");
                StudentSystem ss = new StudentSystem();
                ss.startSystem();
                return;
            }
            System.out.println("用户名或密码错误");
            System.out.println("还剩" + (2 - i) + "次机会");
        }

//            if (index >= 0) {
//                for (int i = 0; true; i++) {
//                    System.out.println("请输入密码");
//                    String password = sc.next();
//                    String verificationCode = getVerificationCode();
//                    System.out.println("验证码:" + verificationCode);
//                    System.out.println("请输入验证码");
//                    String checkCode = sc.next();
//                    if (verificationCode.equals(checkCode)) {
//                        if (password.equals(users.get(index).getPassword())) {
//                            System.out.println("登录成功");
//                            break loop;
//                        } else if (i < 2) {
//                            System.out.println("密码不正确,请重新输入,还剩" + (2 - i) + "次机会");
//                        } else {
//                            System.out.println("密码不正确,机会已用完");
//                            break loop;
//                        }
//                    } else {
//                        System.out.println("验证码错误,请重新输入");
//                    }
//                }
//            } else {
//                System.out.println("用户未注册,请先注册");
//                for (int i = 0; i < users.size(); i++) {
//                    Users u = users.get(i);
//                    System.out.println("用户名:" + u.getUserName() + " 密码:" + u.getPassword() + " 身份证账号:" + u.getUserID() + " 手机号:" + u.getPhoneNumber());
//                }
//                break;
//            }


    }

    // 判断用户名和密码是否正确
    private static boolean checkLogin(ArrayList<Users> users, Users userInfo) {
        for (int i = 0; i < users.size(); i++) {
            Users user = users.get(i);
            if (userInfo.getUserName().equals(user.getUserName()) && userInfo.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }


    public static void forgetPassword(ArrayList<Users> users) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名");
        String name = sc.next();
        int index = getIndex(users, name);
        if (index < 0) {
            System.out.println("用户" + name + "未注册,请先注册");
            return;
        }
        System.out.println("请输入你的身份证号");
        String personID = sc.next();
        System.out.println("请输入你的手机号");
        String number = sc.next();
        Users user = users.get(index);
        if (!(user.getUserID().equalsIgnoreCase(personID) && user.getPhoneNumber().equals(number))) {
            System.out.println("账号信息不匹配,修改失败");
            return;
        }
        String password;
        while (true) {
            System.out.println("请输入新密码");
            password = sc.next();
            System.out.println("请再次输入");
            String againPassword = sc.next();
            if (password.equals(againPassword)){
                break;
            }else {
                System.out.println("两次密码不一致");
            }
        }
        user.setPassword(password);
        System.out.println("修改成功");

//            if (index >= 0) {
//                System.out.println("请输入你的身份证号");
//                String id = sc.next();
//                System.out.println("请输入你的手机号");
//                String number = sc.next();
//                Users user = users.get(index);
//                if (id.equals(user.getUserID()) && number.equals(user.getPhoneNumber())) {
//                    System.out.println("请输入新密码");
//                    user.setPassword(sc.next());
//                    System.out.println("修改成功");
//                    break;
//                } else {
//                    System.out.println("账号信息不匹配,修改失败");
//                }
//            } else {
//                System.out.println("用户未注册,请先注册");
//                break;
//            }

        for (int i = 0; i < users.size(); i++) {
            Users u = users.get(i);
            System.out.println("用户名:" + u.getUserName() + " 密码:" + u.getPassword() + " 身份证账号:" + u.getUserID() + " 手机号:" + u.getPhoneNumber());
        }

    }

    // 判断用户名是否存在
    public static boolean contains(ArrayList<Users> users, String username) {
        return getIndex(users, username) >= 0;
    }

    // 获取索引
    public static int getIndex(ArrayList<Users> users, String username) {
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUserName())) {
                return i;
            }

        }
        return -1;
    }

    // 判断用户名是否规范
    private static boolean checkName(String userName) {
        // 长度判断
        int len = userName.length();
        if (len < 3 || len > 15) {
            return false;
        }
        // 判断是否为字母加数字
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c > '0' && c <= '9'))) {
                return false;
            }
        }
        // 判断是否为纯数字
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                return true;
            }
        }
        return false;

    }

    // 判断ID是否符合身份证的规范
    public static boolean checkPersonID(String id) {
        // 判断长度是否符合
        if (id.length() != 18) {
            return false;
        }
        // 判断首位是否为0
        if (id.startsWith("0")) {
            return false;
        }

        for (int i = 0; i < id.length() - 1; i++) {
            char c = id.charAt(i);
//            if (i == 0 && c == '0') { // 判断首位是否为0
//                return false;
            if (!(c >= '0' && c <= '9')) {  //判断前17位是否都为数字
                return false;
            }
//            else if (!((c >= '0' && c <= '9') || c == 'x' || c == 'X')) { // 判断最后一位是否为数字或者x X
//                return false;
//            }
        }
        // 判断最后一个字符是否符合要求
        char endChar = id.charAt(id.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || endChar == 'x' || endChar == 'X') {
            return true;
        } else {
            return false;
        }
    }

    // 判断手机号是否全为数字
    public static boolean checkNumber(String number) {
        // 判断长度
        if (number.length() != 11) {
            return false;
        }
        // 检查开头
        if (number.startsWith("0")) {
            return false;
        }

        // 检查是否为纯数字
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    // 获取验证码
    public static String getVerificationCode() {
        ArrayList<Character> letters = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            letters.add((char) ('a' + i));
            letters.add((char) ('A' + i));
        }
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(letters.size());
            sb.append(letters.get(index));
        }
        sb.append(r.nextInt(10));
        return upset(sb.toString());
    }

    // 打乱字符串
    public static String upset(String str) {
        Random r = new Random();
        char[] chars = str.toCharArray();
        int end = chars.length - 1;
        char temp = chars[end];
        int index = r.nextInt(chars.length);
        chars[end] = chars[index];
        chars[index] = temp;

        return new String(chars);
    }

}
