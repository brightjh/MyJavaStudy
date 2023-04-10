package StringDemo;

public class StringDemo2 {
    public static void main(String[] args) {
//        对比字符串
        String str1 = new String("abc");
        String str2 = "abc";

//        ==号的比较
        System.out.println(str1 == str2);  // str1是字符串 str2是堆内存地址值

//        equals使用
        boolean result1 = str1.equals(str2);
        System.out.println(result1);  // 必须完全相同

//        忽略大小写
        String str3 = "Abc";
        boolean result2 = str1.equalsIgnoreCase(str3);
        System.out.println(result2);
    }
}
