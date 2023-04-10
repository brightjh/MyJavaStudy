package top.brightzm.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @description: 带概率的随机点名
 * @author: bright
 * @time: 2023/3/29 上午8:13
 */
public class Test2 {

    public static void main(String[] args) {
        // 70%概率获取1
        // 30% 0

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);
        Collections.shuffle(list);

        Random r = new Random();
        int index = list.get(r.nextInt(list.size()));

        // 创建男生和女生列表
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "男", "男", "男", "男", "男", "男", "男");
        Collections.addAll(girlList, "女", "女", "女", "女", "女", "女");

        // 抽取男女生
        String name;
        if (index == 1) {
            name = boyList.get(r.nextInt(boyList.size()));
        } else {
            name = girlList.get(r.nextInt(girlList.size()));
        }


        System.out.println(name);


    }

}
