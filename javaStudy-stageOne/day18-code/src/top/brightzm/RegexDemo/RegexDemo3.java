package top.brightzm.RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        //按要求爬取数据  找出所有JavaXX
        /* Java自从95年问世以来,经历了许多版本,企业中用的最多是Java8 和 Java11
        因为这两个是长期支持版本,下个长期支持版本是Java17,相信Java17也会逐渐登上历史舞台*/

        String str = "Java自从95年问世以来,经历了许多版本,企业中用的最多是Java8 和 Java11," +
                "因为这两个是长期支持版本,下个长期支持版本是Java17,相信Java17也会逐渐登上历史舞台";

        // method(str);

        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);

        while (m.find()) {
            System.out.println(m.group());
        }


    }

    private static void method(String str) {
        //        Pattern:表示正则表达式
//        Matcher: 文本匹配器,按照正则表达式的规则去读取字符串,从头开始,寻找符合规则的字符串

        // 获取正则表达式对象
        Pattern p = Pattern.compile("Java\\d{0,2}");


        //获取文本匹配器
        // m是文本匹配器对象
        // p是规则
        // str是大串
        // m要从str中寻找符合p规则的小串
        Matcher m = p.matcher(str);

        // 判断是否有符合规则的小串
        // 没有就返回false
        // 有就返回true,并对小串第一个字符的索引和最后一个字符索引+1进行保存
        boolean b = m.find();

        // 根据find的索引在大串中进行截取(subString方法)
        String s = m.group();
        System.out.println(s);

        //随后再次进行find并截取,不断往下
    }


}
