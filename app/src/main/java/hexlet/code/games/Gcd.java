package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Gcd {
    public static void main() {
        String rulesGame = "Find the greatest common divisor of given numbers.";
        String[] listQuestion = new String[Engine.MAX_COUNT_GAME];
        String[] listAnswer = new String[Engine.MAX_COUNT_GAME];

        for (int i = 0; i < Engine.MAX_COUNT_GAME; i++) {
            int randomNumber1 = new Random().nextInt(Engine.RANDOM_BOUND);
            int randomNumber2 = new Random().nextInt(Engine.RANDOM_BOUND);
            int a = randomNumber1;
            int b = randomNumber2;
            while (a != 0 && b != 0) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            listQuestion[i] = randomNumber1 + " " + randomNumber2;
            listAnswer[i] = Integer.toString(a + b);
        }
        Engine.game(rulesGame, listQuestion, listAnswer);
    }
}
