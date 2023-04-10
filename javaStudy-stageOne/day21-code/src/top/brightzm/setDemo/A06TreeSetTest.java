package top.brightzm.setDemo;

import java.util.TreeSet;

public class A06TreeSetTest {
    public static void main(String[] args) {
        // 使用treeSet进行排序，先按长度排序，长度相同按照默认排序

        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            // 按照长度进行排序
            int i = o1.length() - o2.length();
            // 长度一样默认排序
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        }
        );

        // 添加数据
        ts.add("ab");
        ts.add("cd");
        ts.add("cde");
        ts.add("qwer");
        ts.add("java");

        System.out.println(ts);


    }


}
