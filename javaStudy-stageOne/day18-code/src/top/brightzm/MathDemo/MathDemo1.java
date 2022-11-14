package top.brightzm.MathDemo;

public class MathDemo1 {
    public static void main(String[] args) {
        /*// abs 获取绝对值
        System.out.println(Math.abs(-89));
        System.out.println(Math.abs(89));
        // bug
        System.out.println(Math.abs(-2147483648));
        // 如果负数超过正数范围 结果会有Bug
        System.out.println(Math.absExact(-2147483648));*/


       /* // 向上取整
        System.out.println(Math.ceil(11.55));
        System.out.println(Math.ceil(11.11));
        System.out.println(Math.ceil(-11.11));
        System.out.println(Math.ceil(-11.11));
        // 在数轴向正方向进一
        System.out.println("===================================");
        // 向下取整
        System.out.println(Math.floor(11.55));
        System.out.println(Math.floor(11.11));
        System.out.println(Math.floor(-11.11));
        System.out.println(Math.floor(-11.11));*/

       /* // 四舍五入
        System.out.println(Math.round(11.55));
        System.out.println(Math.round(11.11));
        System.out.println(Math.round(-11.55));
        System.out.println(Math.round(-11.11));*/

       /* // 获取两个整数的最大值
        System.out.println(Math.max(20,22));
        // 获取最小值
        System.out.println(Math.min(20,22));*/

        /*// 获取a的b次方
        System.out.println(Math.pow(2,3));
        // 开根号
        System.out.println(Math.pow(4,0.5));
        System.out.println(Math.sqrt(4)); // 数字必须大于1的正整数

        // 开立方根
        System.out.println(Math.cbrt(8));

        // 分数次方
        System.out.println(Math.pow(2,-2));*/

        // 0到1(不包含)
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }



    }

}
