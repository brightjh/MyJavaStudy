package StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        // 字符直接赋值
        String str1 = "唐俊豪";
        System.out.println(str1);

//        使用new方式获取字符串对象
//        空参
        String str2 = new String();
        System.out.println("@" + str2 + "~");

//         有参
//        传递字符数组,根据数组来创建新的字符串对象
        char[] chars = {'宋', '媛', '娜'};
        String str3 = new String(chars);
        System.out.println(str3);

//        传递字节数组,根据字节数组内容创建,根据ascii编码
        byte[] bytes = {97, 98, 99};
        String st4 = new String(bytes);
        System.out.println(st4);


    }

}
