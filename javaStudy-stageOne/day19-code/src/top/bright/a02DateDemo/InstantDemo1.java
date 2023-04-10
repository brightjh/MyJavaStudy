package top.bright.a02DateDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo1 {
    public static void main(String[] args) {
        // 获取当前时间的Instant对象
        Instant now = Instant.now();
        System.out.println(now);

        System.out.println("------------------------");
        // 根据(秒/毫秒/纳秒) 获取Instant对象
        Instant milli = Instant.ofEpochMilli(6000L);
        System.out.println(milli);

        Instant second = Instant.ofEpochSecond(60L);
        System.out.println(second);

        Instant nano = Instant.ofEpochSecond(60L, 1000000);
        System.out.println(nano);

        //指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        System.out.println("----------------------------");
        //判断
        Instant instant1 = Instant.ofEpochMilli(10000L);
        Instant instant2 = Instant.ofEpochMilli(60000L);

        System.out.println(instant1.isAfter(instant2));
        System.out.println(instant1.isBefore(instant2));

        System.out.println("----------------------------");

        // 增加和减少时间(本质上不会改变,而是新建一个对象)
        Instant instant3 = Instant.ofEpochSecond(600000L);
        System.out.println(instant3);

        Instant instant4 = instant3.minusSeconds(60L);
        System.out.println(instant4);


    }
}
