package top.bright.a01DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) throws ParseException {
        // 格式化输出时间

        // 原始格式
        Date d = new Date();
        System.out.println(d);

        // 默认格式化
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        System.out.println(dateFormat.format(d));

        // 指定格式
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("y年MM月dd日 HH:mm:ss E");
        String format = dateFormat1.format(d);
        System.out.println(format);

        Date date = dateFormat1.parse(format);
        System.out.println(date);

    }
}
