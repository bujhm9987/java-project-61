package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void main() {
        String rulesGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] listQuestion = new String[Engine.MAX_COUNT_GAME];
        String[] listAnswer = new String[Engine.MAX_COUNT_GAME];
        for (int i = 0; i < Engine.MAX_COUNT_GAME; i++) {
            int randomNumber = new Random().nextInt(Engine.RANDOM_BOUND - 2) + 2;
            int m = 2;
            int n = 0;
            while (m * m <= randomNumber && n != 1) {
                if (randomNumber % m == 0) {
                    n = 1;
                }
                m++;
            }
            listQuestion[i] = Integer.toString(randomNumber);
            listAnswer[i] = n == 1 ? "no" : "yes";
        }
        Engine.game(rulesGame, listQuestion, listAnswer);
    }
}
