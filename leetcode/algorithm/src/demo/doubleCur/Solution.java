package demo.doubleCur;

import java.util.Arrays;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/30 下午8:22
 */
public class Solution {

    public static void main(String[] args) {
        // 输入
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // 解决k大于数组长度
        int n = nums.length;

        k %= n;

        // 整体反转
        reverse(nums, 0, n - 1);

        // k之前反转
        reverse(nums, 0, k - 1);

        // k之后反转
        reverse(nums, k, n - 1);


        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

}
