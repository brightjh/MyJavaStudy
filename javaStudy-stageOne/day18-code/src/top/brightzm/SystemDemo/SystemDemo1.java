package top.brightzm.SystemDemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        // 形参:0 正常停止
        // 非0 异常停止
       /* System.exit(0);
        System.out.println("执行");*/

        // 距离时间原点 (毫秒)
        // long l = System.currentTimeMillis();
        // System.out.println(l);

         /*int[] arr1 = {1,2,3,4,5,6,7,8};
         int[] arr2 = new int[7];
         // copy数组
        System.arraycopy(arr1,0,arr2,0,7);
        //              原数组, 起始索引, 目标数组,目的起始索引,拷贝的个数

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+",");
        }*/

        /*课堂练习:
        arr1: 0,1,2,3,4,5,6,7,8,9*/
        // copy to arr2: 0,0,0,0,1,2,3,0,0,0
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[10];
        // copy:
        System.arraycopy(arr1, 1, arr2, 4, 3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }


    }
}
