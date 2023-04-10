package modelTest1;

import java.util.Random;

public class VerifyCode {
    public static void main(String[] args) {
//        随即产生一个5位的验证码
        char[] letter = new char[52];
        for (int i = 0; i < letter.length; i++) {
            if (i < 26) {
                letter[i] = (char) (i + 65);
            } else {
                letter[i] = (char) (i + 97 - 26);
            }

        }
        StringBuilder result = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
                result.append(letter[r.nextInt(52)]);

            }
        result.append(r.nextInt(10));
        System.out.println(result);

    }
}
