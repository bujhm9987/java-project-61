package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void main() {
        Engine.welcome();

        int resulOper = 0;
        String simbolOper = "";

        System.out.println("What is the result of the expression?");

        while (Engine.countGame < 3) {
            int rndNum1 = new Random().nextInt(100);
            int rndNum2 = new Random().nextInt(100);
            int numOper = new Random().nextInt(3); // Операции 0(+), 1(-), 2(*)
            switch (numOper) {
                case (0):
                    resulOper = rndNum1 + rndNum2;
                    simbolOper = " + ";
                    break;
                case (1):
                    resulOper = rndNum1 - rndNum2;
                    simbolOper = " - ";
                    break;
                case (2):
                    resulOper = rndNum1 * rndNum2;
                    simbolOper = " * ";
                    break;
            }

            Engine.question = rndNum1 + simbolOper + rndNum2;
            Engine.result = Integer.toString(resulOper);
            Engine.answer();
            Engine.checkResult();
        }
    }
}
