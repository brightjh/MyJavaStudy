package top.brightzm.RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest3 {
    public static void main(String[] args) {
        /* Java自从95年问世以来,经历了许多版本,企业中用的最多是Java8 和 Java11
        因为这两个是长期支持版本,下个长期支持版本是Java17,相信Java17也会逐渐登上历史舞台*/

        String str = "Java自从95年问世以来,经历了许多版本,企业中用的最多是Java8 和 Java11," +
                "因为这两个是长期支持版本,下个长期支持版本是Java17,相信Java17也会逐渐登上历史舞台";

        // 爬取Java版本的字段.但是只保留Java

        // ?表示前面的Java =表示后面要跟随的,但是获取时不会获取后面的
        Pattern pattern1 = Pattern.compile("((?i)Java)(?=8|11|17)");
        Matcher matcher1 = pattern1.matcher(str);
        while (matcher1.find()){
            System.out.println(matcher1.group());
        }

        System.out.println("-------------------------------------");

        //爬取Java版本的字段,显示版本
        // : 表示带上后面 获取时会获取后面
        Pattern pattern2 = Pattern.compile("((?i)Java)(?:8|11|17)");
        Pattern pattern3 = Pattern.compile("((?i)Java)(8|11|17)");
        Matcher matcher2 = pattern3.matcher(str);
        while (matcher2.find()){
            System.out.println(matcher2.group());
        }

        System.out.println("-------------------------------------");

        // 爬取不包含Java版本的字段
        Pattern pattern4 = Pattern.compile("((?i)Java)(?!8|11|17)");

        Matcher matcher3 = pattern4.matcher(str);
        while (matcher3.find()){
            System.out.println(matcher3.group());
        }


    }
}
