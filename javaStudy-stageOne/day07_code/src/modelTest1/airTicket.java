package modelTest1;

import java.util.Scanner;

public class airTicket {
    public static void main(String[] args) {
//        按季节计算机票价格
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double oldPrice = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("是否选择头等舱 1是 0不是");
        int seat = sc.nextInt();
        double newPrice = 0;
        if (month >= 5 && month <= 10) {
//            if (seat == 1) {
//                newPrice = oldPrice*0.9;
//            }else {
//                newPrice = oldPrice*8.5;
//            }
            double discount1 = 0.9;
            double discount2 = 0.85;
            newPrice = getNewPrice(seat, oldPrice, discount1, discount2);
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
//            if (seat ==1) {
//                newPrice = oldPrice*0.7;
//            }else {
//                newPrice = oldPrice*6.5;
//            }
            double discount1 = 0.7;
            double discount2 = 0.65;
            newPrice = getNewPrice(seat, oldPrice, discount1, discount2);
        } else {
            System.out.println("不存在该月份");
        }
        System.out.println("机票价格是" + newPrice + "元");


    }

    public static double getNewPrice(int seat, double oldPrice, double discount1, double discount2) {
        double newPrice = 0;
        if (seat == 1) {
            newPrice = oldPrice * discount1;
        } else if (seat == 0) {
            newPrice = oldPrice * discount2;
        } else {
            System.out.println("不存在该座位");
        }
        return newPrice;

    }
}
