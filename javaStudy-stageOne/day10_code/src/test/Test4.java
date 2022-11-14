package test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
//        验证码的创建
        char[] letters = getLetters();
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(52);
            sb.append(letters[index]);
        }
        int number = r.nextInt(10);
        sb.append(number);
        String string = sb.toString();
        string = upset(string);
        System.out.println(string);


    }

    // 获取26个大写字母和小写字母的数组
    public static char[] getLetters() {
        char[] letters = new char[52];
        for (int i = 0; i < 26; i++) {
            letters[i] = (char) (i + 65);
        }
        for (int i = 26; i < 52; i++) {
            letters[i] = (char)(i+97-26);
        }
        return letters;
    }

    // 打銮数组

    public static String upset(String str){
        char[] charArray = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < charArray.length; i++) {
            char temp = charArray[i];
            int randomIndex = r.nextInt(charArray.length);
            charArray[i] = charArray[randomIndex];
            charArray[randomIndex] = temp;
        }
        return new String(charArray);

    }



}
