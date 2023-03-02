package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Gcd {
    public static void main() {
        Engine.welcome();

        System.out.println("Find the greatest common divisor of given numbers.");

        while (Engine.countGame < 3) {
            int rndNum1 = new Random().nextInt(100);
            int rndNum2 = new Random().nextInt(100);
            int a = rndNum1;
            int b = rndNum2;
            while (a != 0 && b != 0) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            int gcd = a + b;

            Engine.question = rndNum1 + " " + rndNum2;
            Engine.result = Integer.toString(gcd);
            Engine.answer();
            Engine.checkResult();
        }
    }
}
