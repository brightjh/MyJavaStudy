package modelTest1;

public class ScoreTest {
    public static void main(String[] args) {
//        去除最高分和最低分
        int[] score = {85, 80, 77, 89, 78, 88};
        int  newScore;
        int sum = score[0];
        int max = score[0], mini = score[0];
        for (int i = 1; i < score.length; i++) {
            sum += score[i];
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < mini) {
                mini = score[i];
            }
        }
        System.out.println(max);
        System.out.println(mini);
        System.out.println(sum);
        newScore = (sum-max-mini)/4;
        System.out.println(newScore);


    }
}
