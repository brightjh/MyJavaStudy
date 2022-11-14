package top.brightzm.RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        // 贪婪爬取和非贪婪爬取
        String str = "Java自从95年问世以来abbbbbbbbbbbbbbbbbbbbbbbb,经历了许多版本,企业中用的最多是Java8 和 Java11," +
                "因为这两个是长期支持版本,下个长期支持版本是Java17,相信Java17也会逐渐登上历史舞台";

        // 贪婪爬取
        Pattern p1 = Pattern.compile("ab+");
        Matcher m1 = p1.matcher(str);
        while (m1.find()){
            System.out.println(m1.group());
        }

        System.out.println("----------------------------------");

        //非贪婪爬取
        Pattern p2 = Pattern.compile("ab+?");
        Matcher m2 = p2.matcher(str);
        while (m2.find()){
            System.out.println(m2.group());
        }

    }

}
