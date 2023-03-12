package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final int MAX_COUNT_GAME = 3;
    private static final int RANDOM_BOUND = 98;
    private static final String RULES_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void main() {
        String[][] listAnswerQuestion = new String[MAX_COUNT_GAME][2];
        String[] answerQuestion;

        for (int i = 0; i < MAX_COUNT_GAME; i++) {
            answerQuestion = generateRoundData();
            listAnswerQuestion[i][0] = answerQuestion[0];
            listAnswerQuestion[i][1] = answerQuestion[1];
        }
        Engine.game(RULES_GAME, listAnswerQuestion);
    }
    private static String[] generateRoundData() {
        String[] answerQuestion = new String[2];
        int randomNumber = new Random().nextInt(RANDOM_BOUND) + 2;

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
