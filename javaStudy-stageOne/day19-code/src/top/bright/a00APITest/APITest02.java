package top.bright.a00APITest;

public class APITest02 {
    public static void main(String[] args) {
        // 将字符串数据转为整数
        String str = "12345";

        if (!(str.matches("[1-9]\\d{1,10}"))){
            System.out.println("数据格式有误");
        }else {
            System.out.println("格式正确");
            // 定义一个变量存储结果
            int number = 0;

            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                number = number*10 + c;
            }
            System.out.println(number);

        }


    }

    /*private static int toInt(String str) {
        int length = str.length();
        if (length<1||length>10){
            System.out.println("数字长度不符");
            return 0;
        }
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c<'0' || c>'9'){
                System.out.println("数字含有其他字符");
                return 0;
            }
            num += ((byte)(c) - 48)* 10.;
            System.out.println(num);
        }
        return num;
    }*/
}
