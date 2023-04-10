package top.brightzm.BasicSearchDemo;

import java.util.ArrayList;

public class SearchDemo2 {
    public static void main(String[] args) {
        // 基本查找，查询某个元素在数组中的索引
        // 考虑重复的可能性
        int[] list = {131,127,147,81,181,23,7,79,131};
        System.out.println(search(131, list));

    }

    public static ArrayList<Integer> search(int number,int[] list){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == number){
                arrayList.add(i);
            }
        }
        return arrayList;
    }
}
