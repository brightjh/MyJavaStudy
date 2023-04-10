package demo.bianrySearch;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/28 下午6:42
 */
public class FindBadVersion {


    public static void main(String[] args) {
        int i = firstBadVersion(10);
        System.out.println(i);

    }

    public static int firstBadVersion(int n) {

        int left = 1, right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            boolean result1 = isBadVersion(middle);
            if (result1) {
                right = middle + 1;
            } else {
                left = middle;
            }
        }
        return left;
    }


    public static boolean isBadVersion(int version) {
        return version >= 7;
    }
}
