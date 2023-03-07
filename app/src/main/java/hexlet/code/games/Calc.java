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
            switch (numberOperation) {
                case (0) -> {
                    listAnswerQuestion[i][0] = randomNumber1 + " + " + randomNumber2;
                    listAnswerQuestion[i][1] = Integer.toString(randomNumber1 + randomNumber2);
                }
                case (1) -> {
                    listAnswerQuestion[i][0] = randomNumber1 + " - " + randomNumber2;
                    listAnswerQuestion[i][1] = Integer.toString(randomNumber1 - randomNumber2);
                }
                default -> {
                    listAnswerQuestion[i][0] = randomNumber1 + " * " + randomNumber2;
                    listAnswerQuestion[i][1] = Integer.toString(randomNumber1 * randomNumber2);
                }
            }
        }
        Engine.game(rulesGame, listAnswerQuestion);
    }
}
