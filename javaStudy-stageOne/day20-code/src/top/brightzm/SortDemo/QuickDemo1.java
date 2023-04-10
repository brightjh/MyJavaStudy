package top.brightzm.SortDemo;

public class QuickDemo1 {
    public static void main(String[] args) {
        // 实现快速排序的第一轮
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 5, 10, 8};

        quickSort(arr, 0, arr.length - 1);

        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }


    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i + 1;
        int end = j;

        if (start > end) {
            return;
        }

        int baseNumber = arr[i];

        while (start != end) {
            // 从后往前找比基数小的数
            while (true) {
                if (arr[end] < baseNumber || end <= start) {
                    break;
                }
                end--;
            }

            // 从前往后找比基数大的数
            while (true) {
                if (arr[start] > baseNumber || end <= start) {
                    break;
                }
                start++;
            }

            // 交换start和end指向的数字
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }

        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;


        // 左边重复
        quickSort(arr, i, start - 1);

        // 右边重复
        quickSort(arr, start + 1, j);

    }


}
