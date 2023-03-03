package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void main() {
        Engine.welcome();
        int randomBound = 99;

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (Engine.countGame < 3) {
            int randomNumber = new Random().nextInt(randomBound) + 1;
            int i = 2;
            int j = 0;
            while (i * i <= randomNumber && j != 1) {
                if (randomNumber % i == 0) {
                    j = 1;
                }
                i++;
            }

            Engine.result = j == 1 ? "no" : "yes";
            Engine.question = Integer.toString(randomNumber);
            Engine.answer();
            Engine.checkResult();
        }
    }
}
