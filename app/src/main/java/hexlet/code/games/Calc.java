package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void main() {

        Engine.welcome();
        int result = 0;
        int randomBound = 100;
        String operation = "";

        System.out.println("What is the result of the expression?");

        while (Engine.countGame < 3) {
            int randomNumber1 = new Random().nextInt(randomBound);
            int randomNumber2 = new Random().nextInt(randomBound);
            int numberOperation = new Random().nextInt(3); // Операции 0(+), 1(-), 2(*)
            switch (numberOperation) {
                case (0):
                    result = randomNumber1 + randomNumber2;
                    operation = " + ";
                    break;
                case (1):
                    result = randomNumber1 - randomNumber2;
                    operation = " - ";
                    break;
                default:
                    result = randomNumber1 * randomNumber2;
                    operation = " * ";
                    break;
            }

            Engine.question = randomNumber1 + operation + randomNumber2;
            Engine.result = Integer.toString(result);
            Engine.answer();
            Engine.checkResult();
        }
    }
}
