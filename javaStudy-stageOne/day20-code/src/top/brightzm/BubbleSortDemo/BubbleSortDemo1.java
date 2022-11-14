package top.brightzm.BubbleSortDemo;

public class BubbleSortDemo1 {
    public static void main(String[] args) {
        // 冒泡排序
        int[] arr = {2, 4, 5, 3, 1};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int n = 0; n < arr.length; n++) {
                System.out.print(arr[n] + ",");
            }
            System.out.println("");
        }


    }


}
