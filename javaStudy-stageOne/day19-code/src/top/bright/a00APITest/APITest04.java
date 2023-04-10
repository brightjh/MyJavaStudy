package top.bright.a00APITest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class APITest04 {
    public static void main(String[] args) throws ParseException {
        // 计算自己已经活了多少天

        // JDK7时间
        String birthday = "2002年2月21日";
        SimpleDateFormat dateFormat = new SimpleDateFormat("y年M月d日");
        Date birDate = dateFormat.parse(birthday);
        long brithTime = birDate.getTime();

        long nowTime = System.currentTimeMillis();

        long time = nowTime - brithTime;
        System.out.println(time / 1000 / 60 /60 /24);


        // JDK8
        LocalDate brithDate = LocalDate.of(2001,10,29);
        LocalDate nowDate = LocalDate.now();

        System.out.println(ChronoUnit.DAYS.between(brithDate, nowDate));

    }

}
