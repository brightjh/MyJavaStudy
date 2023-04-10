package top.brightzm.treeMapDemo;

import java.util.TreeMap;

/**
 * @description: 统计字符串中每一个字符出现的次数
 * @author: bright
 * @time: 2023/3/27 上午9:51
 */
public class Test3 {
    public static void main(String[] args) {
        String str = "aaabacdccddbeaaabb";

        TreeMap<Character, Integer> chars = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            int count;
            char c = str.charAt(i);
            count = chars.containsKey(c) ? chars.get(c) + 1 : 1;
            chars.put(c, count);
        }

        StringBuilder sb = new StringBuilder();

        chars.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));

        System.out.println(sb);

    }
}
