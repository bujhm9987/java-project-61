package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void main() {
        Engine.welcome();
        int randomBound = 100;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (Engine.countGame < 3) {
            int randomNumber = new Random().nextInt(randomBound);

            Engine.question = Integer.toString(randomNumber);
            Engine.result = (randomNumber % 2 == 0) ? "yes" : "no";
            Engine.answer();
            Engine.checkResult();
        }
    }
}
