package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Gcd {
    public static void main() {
        Engine.welcome();
        int randomBound = 100;

        System.out.println("Find the greatest common divisor of given numbers.");

        while (Engine.countGame < 3) {
            int randomNumber1 = new Random().nextInt(randomBound);
            int randomNumber2 = new Random().nextInt(randomBound);
            int a = randomNumber1;
            int b = randomNumber2;
            while (a != 0 && b != 0) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            int gcd = a + b;

            Engine.question = randomNumber1 + " " + randomNumber2;
            Engine.result = Integer.toString(gcd);
            Engine.answer();
            Engine.checkResult();
        }
    }
}
