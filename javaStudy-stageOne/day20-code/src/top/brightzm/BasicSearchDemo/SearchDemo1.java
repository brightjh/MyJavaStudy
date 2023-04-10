package top.brightzm.BasicSearchDemo;

public class SearchDemo1 {
    public static void main(String[] args) {
        // 定义一个方法利用基本查找，查询某个元素是否存在

        int[] list = {131,127,147,81,181,23,7,79};

        boolean result = search(list,79);
        System.out.println(result);

    }

    public static boolean search(int [] list,int s){
        for (int i = 0; i < list.length; i++) {
            if (list[i] == s){
                return true;
            }
        }
        return false;

    }






}
