package top.bright.a01DateDemo;

import java.util.Date;
import java.util.Random;

public class DateTest1 {
    public static void main(String[] args) {
        // 打印时间原点一年之后的时间
        Date d = new Date(0L);
        System.out.println(d);

        long time = d.getTime();
        time = time +1000L*60L*60L*24L*365L;
        d.setTime(time);
        System.out.println(d);

        System.out.println("--------------------------------");

        // 定义两个Date对象,比较那个时间在前,哪个在后
        Random r = new Random();

        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        System.out.println(d2);

        long time1 = d1.getTime();
        long time2 = d2.getTime();

        if (time1<time2){
            System.out.println("d1 时间在前");
        }else if (time1>time2){
            System.out.println("d2 时间在前");
        }else {
            System.out.println("两个时间相同");
        }



    }
}
