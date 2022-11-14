package top.brightzm.RegexDemo;

public class RegexTest4 {
    public static void main(String[] args) {
        // 判断一个字符串的开始字符和结束字符是否一致 一个字符
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b345b".matches(regex1));
        System.out.println("&789&".matches(regex1));
        System.out.println("*fwfs".matches(regex1));

        System.out.println("-----------------------------");

        // 判断一个字符串的开始部分和结束部分是否相同 多个字符
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("bbb456bbb".matches(regex2));
        System.out.println("123456123".matches(regex2));
        System.out.println("&!@qq&!@".matches(regex2));
        System.out.println("abd789abc".matches(regex2));

        System.out.println("----------------------------------");

        // 判断一个字符串的开始部门和结束部分是否一致  开始部分内部每个字符也需要相同
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&bc&&".matches(regex3));
        System.out.println("aac123aac".matches(regex3));
        System.out.println("a123a".matches(regex3));


    }
}
