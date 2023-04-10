package methodTest;

public class MethodTest09 {
    public static void main(String[] args) {
//        复制数组
        int [] array = {1,2,3,4,5,6,7};
        int from =2;
        int to = 5;
        int [] newArray = copyOfRange(array, from,to);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

    }
    public static int [] copyOfRange(int [] array, int from, int to){
        int [] newArray = new int[to - from];
        for(int i = from, j =0; i < to; i++,j++) {
            newArray [j] = array[i];
        }
        return newArray;
    }


}
