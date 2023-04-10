package top.brightzm.hashMapDemo;

import java.util.*;

/**
 * @description: 统计景点票数
 * @author: bright
 * @time: 2022/11/27 下午7:31
 */
public class Test2 {

    public static void main(String[] args) {

        String[] strings = {"A", "B", "C", "D"};

        // 生成80个投票数据
        List<String> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(strings.length);
            list.add(strings[index]);
        }

        // 进行投票
        Map<String, Integer> map = new HashMap<>();
        for (String name : list) {
            int count;
            count = map.containsKey(name) ? map.get(name) + 1 : 1;
            map.put(name, count);
            // System.out.println(value);

        }

        System.out.println(map);

        // 求最大值
        int max = 0;

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            if (max < count){
                max = count;
            }
        }

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            if (max == count){
                System.out.println(entry.getKey());
            }
        }



    }
}
