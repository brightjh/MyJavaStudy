package top.bright.a02DateDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo1 {
    public static void main(String[] args) {
        // 创建带时区的时间对象(当前时间)
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        // 创建带时区的时间对象(指定时间)
        ZonedDateTime zonedDateTime = ZonedDateTime.of(
                2022, 8, 24, 20, 42, 30, 0,
                ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        // 通过Instant + 时区的方式获取指定时间的对象
        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time);

        // 修改时间
        ZonedDateTime zonedDateTime1 = time.withYear(2021);
        System.out.println(zonedDateTime1);

        // 减少时间
        ZonedDateTime zonedDateTime2 = time.minusHours(8);
        System.out.println(zonedDateTime2);

        // 增加时间
        ZonedDateTime zonedDateTime3 = time.plusDays(2);
        System.out.println(zonedDateTime3);
    }

}
