package top.brightzm.BigDecimalDemo;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        // 通过double类型来创建对象
        // 有可能不精确,不建议使用
        /*BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);*/

       /* System.out.println(bd1);
        System.out.println(bd2);*/

        System.out.println("==============");
        // 通过字符串形式创建 更加精确
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        System.out.println(bd3.add(bd4));
        System.out.println(bd3);
        System.out.println(bd4);
        
        // 通过静态方法获取 --如果数字不大,没有超出double范围,建议使用静态方法
        BigDecimal bd5 = BigDecimal.valueOf(10);
        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd5 == bd6);

        // 如果是整数,是提前创建好的对象,否则就是new的新对象
        BigDecimal bd7 = BigDecimal.valueOf(10.0);
        BigDecimal bd8 = BigDecimal.valueOf(10.0);
        System.out.println(bd7 == bd8);


    }
}
