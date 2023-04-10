package top.bright.a02DateDemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {
        // 获取Java中所有时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);

        // 获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        // 获取指定的时区
        ZoneId of = ZoneId.of("America/New_York");
        System.out.println(of);


    }
}
