package top.bright.a03IntegerDemo;

public class IntegerDemo1 {
    public static void main(String[] args) {
        // 创建Integer对象
        Integer integer1 = Integer.valueOf(127);
        Integer integer2 = Integer.valueOf(127);
        System.out.println(integer1 == integer2);

        Integer integer3 = Integer.valueOf(128);
        Integer integer4 = Integer.valueOf(128);
        System.out.println(integer3 == integer4);


    }
}
