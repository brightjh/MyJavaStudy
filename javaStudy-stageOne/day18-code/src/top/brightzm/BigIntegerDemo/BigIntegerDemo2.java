package top.brightzm.BigIntegerDemo;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        // BigInteger的成员方法
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(2);

        // 加法
        System.out.println(bd1.add(bd2));

        // 除法,同时获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        // 比较是否相同
        System.out.println(bd1.equals(bd2));

        // 次幂
        System.out.println(bd1.pow(2));

        // max
        System.out.println(bd1.max(bd2));
        System.out.println(bd1.max(bd2) == bd1);
        System.out.println(bd1.max(bd2) == bd2);

        // 转为int类型
        int i1 = bd2.intValue();
        // long类型
        long l = bd2.longValue();

    }

}
