package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MAX_COUNT_GAME = 3;
    private static final int MAX_RANDOM_BOUND = 100;
    private static final int MIN_RANDOM_BOUND = 2;
    private static final String RULES_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void main() {
        String[][] listAnswerQuestion = new String[MAX_COUNT_GAME][2];

        for (int i = 0; i < MAX_COUNT_GAME; i++) {
            String[] answerQuestion = generateRoundData();
            listAnswerQuestion[i][0] = answerQuestion[0];
            listAnswerQuestion[i][1] = answerQuestion[1];
        }
        Engine.game(RULES_GAME, listAnswerQuestion);
    }
    private static String[] generateRoundData() {
        String[] answerQuestion = new String[2];
        int randomNumber = Utils.generateNumber(MIN_RANDOM_BOUND, MAX_RANDOM_BOUND);

        answerQuestion[0] = Integer.toString(randomNumber);
        answerQuestion[1] = isPrime(randomNumber) ? "no" : "yes";
        return answerQuestion;
    }
    public static boolean isPrime(int number) {
        int m = 2;
        int n = 0;
        while (m * m <= number && n != 1) {
            if (number % m == 0) {
                n = 1;
            }
            m++;
        }
        return n == 1;
    }
}
