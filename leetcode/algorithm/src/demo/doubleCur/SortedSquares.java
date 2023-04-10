package demo.doubleCur;

import java.util.Arrays;

/**
 * @description: 有序数组的平方
 * @author: bright
 * @time: 2022/11/29 下午10:38
 */
public class SortedSquares {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] newList = sorted(nums);
        System.out.println(Arrays.toString(newList));

    }

    public static int[] sorted(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // 新数组
        int[] newList = new int[nums.length];
        // 新数组插入元素的索引
        int k = newList.length - 1;

        // System.out.println(Arrays.toString(nums));

        // 冒泡排序
        /*for (int j = 1; j < newList.length; j++) {
            for (int i = 0; i < newList.length - j; i++) {
                if (newList[i] > newList[i + 1]) {
                    int tmp = newList[i];
                    newList[i] = newList[i + 1];
                    newList[i + 1] = tmp;
                }
            }
        }*/

        // 双指针
        for (int i = 0, j = nums.length - 1; i <= j; ) {
            if (nums[i] > nums[j]){
                newList[k] = nums[i];
                i++;
            }else {
                newList[k] = nums[j];
                j--;
            }
            k--;
        }

        return newList;
    }

}
