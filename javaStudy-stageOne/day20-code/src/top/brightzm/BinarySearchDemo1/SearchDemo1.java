package top.brightzm.BinarySearchDemo1;

public class SearchDemo1 {
    public static void main(String[] args) {
        // 二分查找
        // 定义一个二分查找方法，查询某个元素在数组中的索引
        int[] array = {7, 23, 79, 81, 103, 127, 131, 147};
        int index = binarySearch(150, array);
        System.out.println(index);

    }

    public static int binarySearch(int number, int[] array) {
        int min = 0;
        int max = array.length - 1;


        while (true) {
            if (max < min) {
                return -1;
            }
            int mid = (max + min) / 2;
            if (array[mid] == number) {
                return mid;
            } else if (array[mid] > number) {
                max = mid - 1;
                mid = (max + min) / 2;
            } else if (array[mid] < number) {
                min = mid + 1;
                mid = (max + min) / 2;
            }
        }


//        for (int i = 0; i < array.length; i++) {
//            int value = array[i];
//            if (number == value){
//                return i;
//            }else if (number < value) {
//                max = mid - 1;
//                mid = (max + min) / 2;
//            } else if (max>=min) {
//                min = mid + 1;
//                mid = (max + min) / 2;
//            }else {
//                return -1;
//            }
//
//        }
    }

}
