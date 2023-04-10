package top.bright.a01DateDemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        // 创建日历对象
        Calendar c = Calendar.getInstance();

        // 修改日历代表的时间
        Date d = new Date();
        c.setTime(d);

        // 获取年月日
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int dayWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        int monthWeek = c.get(Calendar.WEEK_OF_YEAR);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(getWeek(dayWeek));
        System.out.println(monthWeek);

    }

    public static String getWeek(int dayWeek){
       /* switch (dayWeek){
            case 1 -> {
                return "星期一";
            }case 2 -> {
                return "星期二";
            }case 3 -> {
                return "星期三";
            }case 4 -> {
                return "星期四";
            }case 5 -> {
                return "星期五";
            }case 6 -> {
                return "星期六";
            }case 7 -> {
                return "星期日";
            }default -> {
                return "";
            }*/
        String[] weeks = {"","星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        return weeks[dayWeek];


    }


}
