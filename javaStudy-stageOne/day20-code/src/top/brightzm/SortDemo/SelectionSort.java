package top.brightzm.SortDemo;

public class SelectionSort {
    public static void main(String[] args) {
        // 选择排序
        int[] arr = {3, 4, 5, 2, 1};


        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i +1 ; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }


    }
}