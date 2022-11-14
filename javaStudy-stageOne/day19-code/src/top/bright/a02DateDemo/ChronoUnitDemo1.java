package top.bright.a02DateDemo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo1 {
    public static void main(String[] args) {
        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();

        // 生日时间
        LocalDateTime brithDate = LocalDateTime.of(2002,2,21,8,11,0,0);
        System.out.println(brithDate);
        System.out.println("相差年数"+ChronoUnit.YEARS.between(brithDate, now));
        System.out.println("相差月数"+ChronoUnit.MONTHS.between(brithDate, now));
        System.out.println("相差周数"+ChronoUnit.WEEKS.between(brithDate, now));
        System.out.println("相差天数"+ChronoUnit.DAYS.between(brithDate, now));
        System.out.println("相差小时数"+ChronoUnit.HOURS.between(brithDate, now));
        System.out.println("相差分钟数"+ChronoUnit.MINUTES.between(brithDate, now));
        System.out.println("相差秒数"+ChronoUnit.SECONDS.between(brithDate, now));
        System.out.println("相差毫秒数"+ChronoUnit.MILLIS.between(brithDate, now));
        System.out.println("相差微秒数"+ChronoUnit.MICROS.between(brithDate, now));
        System.out.println("相差纳秒数"+ChronoUnit.NANOS.between(brithDate, now));
        System.out.println("相差半天数"+ChronoUnit.HALF_DAYS.between(brithDate, now));
        System.out.println("相差十年数"+ChronoUnit.DECADES.between(brithDate, now));
        System.out.println("相差世纪数"+ChronoUnit.CENTURIES.between(brithDate, now));
        System.out.println("相差千年数"+ChronoUnit.MILLENNIA.between(brithDate, now));
        System.out.println("相差纪元数"+ChronoUnit.ERAS.between(brithDate, now));

    }
}
