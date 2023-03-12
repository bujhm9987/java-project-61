package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int MAX_COUNT_GAME = 3;
    private static final int RANDOM_BOUND = 100;
    private static final int COUNT_OPERATION = 3;
    private static final String RULES_GAME = "What is the result of the expression?";
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
        int randomNumber1 = new Random().nextInt(RANDOM_BOUND);
        int randomNumber2 = new Random().nextInt(RANDOM_BOUND);
        int numberOperation = new Random().nextInt(COUNT_OPERATION); // Операции 0(+), 1(-), 2(*)

        answerQuestion[0] = generateQuestion(randomNumber1, randomNumber2, numberOperation);
        answerQuestion[1] = generateAnswer(randomNumber1, randomNumber2, numberOperation);
        return answerQuestion;
    }
    public static String generateQuestion(int number1, int number2, int numOperation) {
        switch (numOperation) {
            case (0) -> {
                return number1 + " + " + number2;
            }
            case (1) -> {
                return number1 + " - " + number2;
            }
            default -> {
                return number1 + " * " + number2;
            }
        }
    }
    public static String generateAnswer(int number1, int number2, int numOperation) {
        switch (numOperation) {
            case (0) -> {
                return Integer.toString(number1 + number2);
            }
            case (1) -> {
                return Integer.toString(number1 - number2);
            }
            default -> {
                return Integer.toString(number1 * number2);
            }
        }
    }
}
