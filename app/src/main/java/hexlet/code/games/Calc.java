package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void main() {
        final int maxCountGame = 3;
        String rulesGame = "What is the result of the expression?";
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
        final int randomBound = 100;
        final int countOperation = 3;
        String[] answerQuestion = new String[2];
        int randomNumber1 = new Random().nextInt(randomBound);
        int randomNumber2 = new Random().nextInt(randomBound);
        int numberOperation = new Random().nextInt(countOperation); // Операции 0(+), 1(-), 2(*)

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
