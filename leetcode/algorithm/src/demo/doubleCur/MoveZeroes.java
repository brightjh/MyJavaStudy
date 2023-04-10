package demo.doubleCur;

import java.util.Arrays;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/30 下午10:53
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        move(nums);

        System.out.println(Arrays.toString(nums));

    }

    public static void move(int[] nums){
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                j++;
            }
        }
    }



}
