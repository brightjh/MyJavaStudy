import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class HowManyDays {
    public static void main(String[] args) throws InterruptedException {
        // 计算你活了多久


        System.out.println("-----距离你出生过多少天了------");
        String yearRegex = "(19\\d{2})|(20[0,1]\\d)|(202[1,2])";
        System.out.println("你是哪一年出生的（例如2000）纯数字，输完请回车");
        int year = Integer.parseInt(getString(yearRegex));

        System.out.println("你是几月出生的 纯数字");
        String monthRegex = "(\\d)|([1][0,1,2])";
        int month = Integer.parseInt(getString(monthRegex));

        System.out.println("你是几号出生的");
        String dayRegex = "(\\d)|([1,2]\\d)|([3][0,1])";
        int day = Integer.parseInt(getString(dayRegex));

        LocalDate date = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        if (date.isAfter(now)){
            System.out.println("你好烦");
            Thread.sleep(2000L);
            System.exit(0);
        }
        System.out.println("你已经出生了"+ ChronoUnit.DAYS.between(date,now)+"天，祝你快乐");


    }

    private static String getString(String regex) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String year;
        for (int i = 0; true; i++) {
            year = sc.nextLine();
            if (!(year.matches(regex)) && i < 2) {
                System.out.println("你tm找茬是不是，重输");
                continue;
            }
            if (!(year.matches("\\d{4}")) && i == 2) {
                System.out.println("告辞！！！");
                Thread.sleep(2000L);
                System.exit(0);
            }
            break;
        }
        return year;
    }


}
