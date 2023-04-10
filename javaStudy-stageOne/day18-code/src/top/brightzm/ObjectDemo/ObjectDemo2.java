package top.brightzm.ObjectDemo;

import com.google.gson.Gson;

public class ObjectDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // clone 浅克隆
        int[] data = {1,2,3,4,5,6,7};
        User user1 = new User(1,"张三","123", data);

        User user2 = (User) user1.clone();

        /*System.out.println(user1);
        System.out.println("==================");
        System.out.println(user2);*/

        // 1验证是浅克隆
        // 2重写之后验证深克隆
        //user1.getData()[3] = 9;
        System.out.println("-----------------------------");

        /*System.out.println(user1);
        System.out.println("==================");
        System.out.println(user2);*/


        // 第三方工具
        // 1 添加代码到项目中
        // 2 编写代码
        Gson gson = new Gson();
        // 把对象变成字符串
        String s = gson.toJson(user1);
        // 再把字符串变回对象
        User user = gson.fromJson(s, User.class);

        user1.getData()[3] = 9;

        System.out.println(user1);

        System.out.println(user);


    }

}
