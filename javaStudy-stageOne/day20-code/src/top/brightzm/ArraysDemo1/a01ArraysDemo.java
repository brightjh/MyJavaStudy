package top.brightzm.ArraysDemo1;

import java.util.Arrays;

public class a01ArraysDemo {
    public static void main(String[] args) {
        // Arrays方法

        // toString 将数组变成字符串
        System.out.println("----------toString---------");
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(array));

        // 二分法查找
        System.out.println("------------binarySearch---------");
        System.out.println(Arrays.binarySearch(array,6));
        System.out.println(Arrays.binarySearch(array,7));
        System.out.println(Arrays.binarySearch(array,10)); // 如果数据不存在，就会返回插入值（查找的数据应该在数组中的位置）+1

        // 拷贝数组
        System.out.println("-----------copyof------------");
        int[] newArr1 = Arrays.copyOf(array,20);
        System.out.println(Arrays.toString(newArr1));
        int[] newArr2 = Arrays.copyOf(array,10);
        System.out.println(Arrays.toString(newArr2));
        int[] newArr3 = Arrays.copyOf(array,8);
        System.out.println(Arrays.toString(newArr3));

        // 指定范围拷贝
        System.out.println("---------copyOfRange-------");
        int[] newArr4 = Arrays.copyOfRange(array,0,9);
        System.out.println(Arrays.toString(newArr4));

        //填充数据
        System.out.println("---------fill-----------");
        Arrays.fill(array,100);
        System.out.println(Arrays.toString(array));

        // 排序，默认升序排序，底层使用快速排序
        System.out.println("----------sort--------");
        int[] array2 = {2,5,1,3,7,6,4,8,9};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));



    }
}
