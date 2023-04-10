package demo.bianrySearch;

/**
 * @description: 二分查找
 * @author: bright
 * @time: 2022/11/28 下午4:25
 */
public class Search {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        /*int result = search(nums, target);
        System.out.println(result);*/

        boolean result1 = false, result2 = false;

        if (!result1 && !result2){
            System.out.println("good");
        }

    }


    /*// 左闭右闭
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length -1;

        // [left,right]
        while (left <= right){
            int middle = (right + left) / 2;
            int value = nums [middle];

            if (target > value) {
                left = middle + 1;
            } else if (target < value) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }*/

    // 左闭右开
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        // [left,right)
        while (left < right) {
            int middle = (right + left) / 2;
            int value = nums[middle];

            if (target > value) {
                left = middle + 1;
            } else if (target < value) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
