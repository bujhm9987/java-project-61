package hexlet.code.games;

import hexlet.code.Constant;
import hexlet.code.Engine;

import java.util.Random;
public class Gcd {
    public static void main() {
        String rulesGame = "Find the greatest common divisor of given numbers.";
        String[][] listAnswerQuestion = new String[Constant.MAX_COUNT_GAME][2];

        for (int i = 0; i < Constant.MAX_COUNT_GAME; i++) {
            int randomNumber1 = new Random().nextInt(Constant.RANDOM_BOUND);
            int randomNumber2 = new Random().nextInt(Constant.RANDOM_BOUND);

            listAnswerQuestion[i][0] = randomNumber1 + " " + randomNumber2;
            listAnswerQuestion[i][1] = generateAnswer(randomNumber1, randomNumber2);
        }
        Engine.game(rulesGame, listAnswerQuestion);
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
