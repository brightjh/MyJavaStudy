package demo.doubleCur;

import java.util.Arrays;

/**
 * @description:
 * @author: bright
 * @time: 2022/12/1 下午11:03
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        getTwoNumber(nums,target);


    }

    public static void getTwoNumber(int[] nums, int target) {

        int start = 0, end = 0;

        for (int i = 0, j = nums.length - 1; i < j; ) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                start = i + 1;
                end = j + 1;
                break;
            }
        }

        int[] result = {start,end};

        System.out.printf(Arrays.toString(result));

    }


}
