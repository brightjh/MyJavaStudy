package top.bright.a01DateDemo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        // 创建一个对象表示当前时间
        Date d1 = new Date();
        System.out.println(d1);


        // 创建一个对象表示指定时间
        // 从时间原点过了多少毫秒后的时间
        Date d2 = new Date(1000L);
        System.out.println(d2);


        // 修改时间
        d2.setTime(2000L);
        System.out.println(d2);

        //获取距离时间原点的毫秒值
        System.out.println(d2.getTime());

    }
}
