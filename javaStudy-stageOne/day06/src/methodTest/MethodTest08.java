package methodTest;

public class MethodTest08 {
    public static void main(String[] args) {
//        判断数是否在数组中
        int  [] array = {1,2,3,4,5,6,7};
        int a = 10;
        boolean result = contains(array, a);
        if(result){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }

    }

    public static boolean contains(int [] array, int a){
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]){
                result = true;
                break;
            }else {
                continue;
            }
        }
        return result;
    }
}
