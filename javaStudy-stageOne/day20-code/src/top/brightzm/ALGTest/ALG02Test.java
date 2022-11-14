package top.brightzm.ALGTest;

public class ALG02Test {
    public static void main(String[] args) {
        // 一对兔子，从出生后第三个月每个月都生一对兔子，小兔子长到第三个月又生一对兔子，假如兔子都不死，第十二个月的兔子对数能有多少

        // 方法一：
        /*int[] arr = new int[12];

        for (int i = 0; i < arr.length; i++) {
            if (i < 2){
                arr[i] = 1;
                continue;
            }
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println("第十二月的兔子对数为"+arr[11]);

        System.out.println(Arrays.toString(arr));*/

        // 方法二
        int number = getNumber(12);
        System.out.println(number);

    }

    public static int getNumber(int month){
        if (month ==1 || month ==2){
            return 1;
        }
        return getNumber(month -1) + getNumber(month-2);

    }

}
