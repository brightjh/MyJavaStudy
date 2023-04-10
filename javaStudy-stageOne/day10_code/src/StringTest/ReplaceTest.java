package StringTest;

public class ReplaceTest {
    public static void main(String[] args) {
        //
        String talk = "CNM,真TMD下饭";
        // 定义敏感词库
        String[] array = {"TMD","CNM","NMSL","MLGB"};
        // 屏蔽敏感词
        for (int i = 0; i < array.length; i++) {
            talk = talk.replace(array[i], "***");
        }

        System.out.println(talk);



    }


}
