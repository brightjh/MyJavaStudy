package top.bright.a01DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleTest2 {
    public static void main(String[] args) throws ParseException {
        // 判断是否参加上秒杀活动
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";

        SimpleDateFormat dateFormat = new SimpleDateFormat("y年M月d日 H:m:s");


        String jia = "2023年11月11日 0:01:00";
        String pi = "2023年11月11日 0:11:00";

        if (checkTime(dateFormat,start,end,jia)){
            System.out.println("小贾参加成功");
        }else {
            System.out.println("小贾参加失败");
        }

        if (checkTime(dateFormat,start,end,pi)){
            System.out.println("小皮参加成功");
        }else {
            System.out.println("小皮参加失败");
        }



    }

    private static boolean checkTime(SimpleDateFormat dateFormat, String start, String end, String order) throws ParseException {

        Date startDate = dateFormat.parse(start);
        Date endDate = dateFormat.parse(end);
        Date orderDate = dateFormat.parse(order);

        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        if ((orderTime >= startTime) && (orderTime <= endTime)){
            return true;
        }
        return false;
    }
}
