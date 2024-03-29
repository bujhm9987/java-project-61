package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int MAX_COUNT_GAME = 3;
    private static final int MAX_RANDOM_BOUND = 100;
    private static final int MIN_RANDOM_BOUND = 0;
    private static final String RULES_GAME = "Find the greatest common divisor of given numbers.";
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
        int randomNumber1 = Utils.generateNumber(MIN_RANDOM_BOUND, MAX_RANDOM_BOUND);
        int randomNumber2 = Utils.generateNumber(MIN_RANDOM_BOUND, MAX_RANDOM_BOUND);

        answerQuestion[0] = randomNumber1 + " " + randomNumber2;
        answerQuestion[1] = generateAnswer(randomNumber1, randomNumber2);
        return answerQuestion;
    }
    public static String generateAnswer(int number1, int number2) {
        int a = number1;
        int b = number2;
        while (a != 0 && b != 0) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return Integer.toString(a + b);
    }
}
