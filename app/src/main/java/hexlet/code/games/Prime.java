package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void main() {
        final int maxCountGame = 3;
        String rulesGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] listAnswerQuestion = new String[maxCountGame][2];
        String[] answerQuestion;

        for (int i = 0; i < maxCountGame; i++) {
            answerQuestion = generateRoundData();
            listAnswerQuestion[i][0] = answerQuestion[0];
            listAnswerQuestion[i][1] = answerQuestion[1];
        }
        Engine.game(rulesGame, listAnswerQuestion);
    }
    private static String[] generateRoundData() {
        final int randomBound = 98;
        String[] answerQuestion = new String[2];
        int randomNumber = new Random().nextInt(randomBound) + 2;

        answerQuestion[0] = Integer.toString(randomNumber);
        answerQuestion[1] = generateAnswer(randomNumber);
        return answerQuestion;
    }
    public static String generateAnswer(int number) {
        int m = 2;
        int n = 0;
        while (m * m <= number && n != 1) {
            if (number % m == 0) {
                n = 1;
            }
            m++;
        }
        return n == 1 ? "no" : "yes";
    }
}
