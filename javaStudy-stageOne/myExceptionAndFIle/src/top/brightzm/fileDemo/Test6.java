package top.brightzm.fileDemo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {

    // 统计每种文件的数量
    public static void main(String[] args) {

        File src = new File("E:\\Java");

        HashMap map = getCount(src);

        System.out.println(map);

    }


    public static HashMap getCount(File src) {

        HashMap<String, Integer> hm = new HashMap<>();

        File[] files = src.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                // 统计文件数量
                String name = file.getName();
                String[] str = name.split("\\.");
                if (str.length >= 2) {
                    String endName = str[str.length - 1];
                    if (hm.containsKey(endName)) {
                        int count = hm.get(endName) + 1;
                        hm.put(endName, count);
                    } else {
                        hm.put(endName, 1);
                    }
                }
            } else {
                // 处理文件夹
                HashMap<String, Integer> map = getCount(file);
                // 遍历map集合
                Set<Map.Entry<String, Integer>> entries = map.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if (hm.containsKey(key)) {
                        hm.put(key, hm.get(key) + value);
                    } else {
                        hm.put(key, value);
                    }
                }
            }
        }
        return hm;
    }

}
