package top.bright.a00APITest;

import java.time.LocalDate;
import java.util.Calendar;

public class APITest05 {
    public static void main(String[] args) {
        // 判断是否为闰年

        // JDK7
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);


        // JDK8
        LocalDate date = LocalDate.of(2000, 3, 1);
        LocalDate localDate = date.minusDays(1);
        System.out.println(localDate);

    }
}
