package top.brightzm.collectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @description: map的不可变集合
 * @author: bright
 * @time: 2023/3/29 下午4:14
 */
public class Demo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("qq","ww");
        map.put("ee","rr");
        map.put("tt","yy");
        map.put("uu","uu");
        map.put("ii","oo");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        Map.Entry[] entriesArr = entries.toArray(new Map.Entry[0]);

        Map map1 = Map.ofEntries(entriesArr);


    }

}
