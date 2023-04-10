package StringDemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //  容量与长度
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // 容量
        System.out.println(sb.length()); // 长度

        // sb.append("abc");

//        sb.append("abcdefghijklmnopqrstuvwxyz");

        sb.append("abcdefghijklmnopqrstuvwxyz123456789");
        System.out.println(sb.capacity()); // 容量
        System.out.println(sb.length()); // 长度

    }
}
