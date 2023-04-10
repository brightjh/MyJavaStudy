package demo.bianrySearch;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/28 下午7:29
 */
public class Insert {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        int target = 0;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // []
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int num = nums[middle];
            if (target > num) {
                left = middle + 1;
            } else if (target < num) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return right + 1;

    }
}
