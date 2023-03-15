package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_COUNT_GAME = 3;
    private static final int MAX_RANDOM_BOUND = 100;
    private static final int MIN_RANDOM_BOUND = 0;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String RULES_GAME = "What is the result of the expression?";
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
        char operator = OPERATORS[Utils.generateNumber(0, OPERATORS.length - 1)];

        answerQuestion[0] = generateQuestion(randomNumber1, randomNumber2, operator);
        answerQuestion[1] = generateAnswer(randomNumber1, randomNumber2, operator);
        return answerQuestion;
    }
    public static String generateQuestion(int number1, int number2, char operator) {
        return number1 + " " + operator + " " + number2;
    }
    public static String generateAnswer(int number1, int number2, char operator) {
        return switch (operator) {
            case '+' -> Integer.toString(number1 + number2);
            case '-' -> Integer.toString(number1 - number2);
            case '*' -> Integer.toString(number1 * number2);
            default -> throw new RuntimeException("Unknown operation: " + operator);
        };
    }
}
