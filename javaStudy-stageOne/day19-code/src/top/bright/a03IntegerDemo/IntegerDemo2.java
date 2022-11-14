package top.bright.a03IntegerDemo;

public class IntegerDemo2 {
    public static void main(String[] args) {
        // 把整数转换成二进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);

        // 把证整数转换成八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);

        // 把整数转换成十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);

        // 将字符串类型转为int类型
        // 只能是数字类型
        int i = Integer.parseInt("100");
        System.out.println(i);
        System.out.println(i+1);

        // 8种包装类，除了Character都有对应的parse方法进行类型转换
        boolean parseBoolean = Boolean.parseBoolean("true");
        System.out.println(parseBoolean);

    }
}
