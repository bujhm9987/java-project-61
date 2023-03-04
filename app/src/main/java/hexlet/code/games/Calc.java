package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void main() {
        String rulesGame = "What is the result of the expression?";
        String[] listQuestion = new String[Engine.maxCountGame];
        String[] listAnswer = new String[Engine.maxCountGame];

        for (int i = 0; i < Engine.maxCountGame; i++) {
            int randomNumber1 = new Random().nextInt(Engine.randomBound);
            int randomNumber2 = new Random().nextInt(Engine.randomBound);
            int numberOperation = new Random().nextInt(3); // Операции 0(+), 1(-), 2(*)
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
