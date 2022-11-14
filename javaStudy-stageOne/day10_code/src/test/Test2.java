package test;

public class Test2 {
    public static void main(String[] args) {
        // 调整字符串,将字符串A第一位移到最后一位,多次之后,如果A能变成B,返回True
        String strA = "abcde";
        String strB = "cdeb";
        boolean result = false;
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);  // 不赋值给strA,strA不会变化,结果错误
            if (strA.equals(strB)){
                    result = true;
                    break;
                }
        }
        System.out.println(result);



    }
    // 第一位移到最后一位
    public static String rotate(String strA){
//        第一种方法
//        char first = strA.charAt(0);
//        String end = strA.substring(1);
//        return end+first;

        char[] chars = strA.toCharArray();
        char first = chars[0];
        for (int i = 1; i < chars.length; i++) {
            chars[i -1] = chars[i];
        }
        chars[chars.length -1] = first;
        return new String(chars);

    }


}
