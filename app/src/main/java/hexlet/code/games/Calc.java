package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void main() {
        String rulesGame = "What is the result of the expression?";
        String[] listQuestion = new String[Engine.MAX_COUNT_GAME];
        String[] listAnswer = new String[Engine.MAX_COUNT_GAME];
        final int countOperation = 3;

        for (int i = 0; i < Engine.MAX_COUNT_GAME; i++) {
            int randomNumber1 = new Random().nextInt(Engine.RANDOM_BOUND);
            int randomNumber2 = new Random().nextInt(Engine.RANDOM_BOUND);
            int numberOperation = new Random().nextInt(countOperation); // Операции 0(+), 1(-), 2(*)
            switch (numberOperation) {
                case (0) -> {
                    listQuestion[i] = randomNumber1 + " + " + randomNumber2;
                    listAnswer[i] = Integer.toString(randomNumber1 + randomNumber2);
                }
                case (1) -> {
                    listQuestion[i] = randomNumber1 + " - " + randomNumber2;
                    listAnswer[i] = Integer.toString(randomNumber1 - randomNumber2);
                }
                default -> {
                    listQuestion[i] = randomNumber1 + " * " + randomNumber2;
                    listAnswer[i] = Integer.toString(randomNumber1 * randomNumber2);
                }
            }
        }
        Engine.game(rulesGame, listQuestion, listAnswer);
    }
}
