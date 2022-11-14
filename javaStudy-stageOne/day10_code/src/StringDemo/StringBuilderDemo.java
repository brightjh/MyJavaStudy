package StringDemo;



public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");


        sb.append(1);
        sb.append('d');
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());

        // 转换为字符串
        String str = sb.toString();
        System.out.println(str);
        // 接下来就可以进行一些字符串的操作

    }

}
