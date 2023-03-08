package hexlet.code.games;

import hexlet.code.Constant;
import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void main() {
        String rulesGame = "What is the result of the expression?";
        String[][] listAnswerQuestion = new String[Constant.MAX_COUNT_GAME][2];
        final int countOperation = 3;

        for (int i = 0; i < Constant.MAX_COUNT_GAME; i++) {
            int randomNumber1 = new Random().nextInt(Constant.RANDOM_BOUND);
            int randomNumber2 = new Random().nextInt(Constant.RANDOM_BOUND);
            int numberOperation = new Random().nextInt(countOperation); // Операции 0(+), 1(-), 2(*)

            listAnswerQuestion[i][0] = generateQuestion(randomNumber1, randomNumber2, numberOperation);
            listAnswerQuestion[i][1] = generateAnswer(randomNumber1, randomNumber2, numberOperation);

        }
        Engine.game(rulesGame, listAnswerQuestion);
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
