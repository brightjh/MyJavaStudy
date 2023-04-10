package top.brightzm.BigIntegerDemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        //获取一个随即的大整数
        Random r = new Random();

//        for (int i = 0; i < 21; i++) {
//            System.out.println(new BigInteger(4, r));
//        }

        // 获取一个指定的大整数
        // 字符串必须是整数
//        BigInteger bd = new BigInteger("100000000");
//        System.out.println(bd);

        // 获取指定进制的大整数
        BigInteger bd2 = new BigInteger("123", 10);
        System.out.println(bd2);

        // 优化:更快获取-16~16的对象
        BigInteger bd3 = BigInteger.valueOf(16);
        BigInteger bd4 = BigInteger.valueOf(16);
        System.out.println(bd3 == bd4);
        System.out.println("===========================");

        BigInteger bd5 = BigInteger.valueOf(17);
        BigInteger bd6 = BigInteger.valueOf(17);
        System.out.println(bd5 == bd6);

        // 对象一旦创建就不能发生改变
        BigInteger bd7 = BigInteger.valueOf(1);
        BigInteger bd8 = BigInteger.valueOf(2);
        System.out.println(bd7.add(bd8));
        // 生成一个新对象用来存储计算的值


    }
}
