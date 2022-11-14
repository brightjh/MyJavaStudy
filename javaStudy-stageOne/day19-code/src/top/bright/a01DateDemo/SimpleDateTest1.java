package top.bright.a01DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTest1 {
    public static void main(String[] args) throws ParseException {
        // 当前日期"2022-08-24" 转换为"2022年8月24日"
        String nowDate = "2022-08-24";
        SimpleDateFormat sd =  new SimpleDateFormat("y-MM-dd");

        Date date = sd.parse(nowDate);
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("y年M月d日");
        System.out.println(sdf.format(date));


    }


}
