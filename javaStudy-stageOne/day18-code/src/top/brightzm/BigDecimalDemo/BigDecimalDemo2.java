package top.brightzm.BigDecimalDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        // 成员方法
        BigDecimal bd1 = new BigDecimal("10.0");
        BigDecimal bd2 = new BigDecimal("2.0");
        BigDecimal bd3 = new BigDecimal("3.0");

        /*// 加
        System.out.println(bd1.add(bd2));


        // 减
        System.out.println(bd1.subtract(bd2));

        // 乘
        System.out.println(bd1.multiply(bd2));*/
        // 除 能除的尽的情况下
        System.out.println(bd1.divide(bd2));

        // 除不尽 精确几位,舍入模式
        System.out.println(bd1.divide(bd3, 2, RoundingMode.HALF_UP));


    }
}
