package top.brightzm.RegexDemo;

public class RegexDemo6 {
    public static void main(String[] args) {
        String str = "天王wekfjfkjwelkfjkJG地虎lwkjfksjklHHKJKkkj宝塔sldkfjwlkeJKJKjxcvKJ河妖";
        // 替换字符串
        String s1 = str.replaceAll("[\\w&&[^_]]+","vs");
        System.out.println(s1);

        // 切割字符串
        String[] array = str.split("[\\w&&[^_]]+");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
