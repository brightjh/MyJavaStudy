package test;

public class Test6 {
    public static void main(String[] args) {
        // 将字符串最后一个单词的长度输出
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入一行英文语句");
        String words = "I LOVE YOU";
        int count = lastWord(words);
        System.out.println(count);

    }

    public static int lastWord(String words){
        StringBuilder sb = new StringBuilder(words);
        sb.reverse();
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ' ) {
                break;
            }else {
                count++;
            }
        }
        return count;
    }

}
