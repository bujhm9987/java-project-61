package hexlet.code.games;

import hexlet.code.Constant;
import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void main() {
        String rulesGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] listAnswerQuestion = new String[Constant.MAX_COUNT_GAME][2];
        for (int i = 0; i < Constant.MAX_COUNT_GAME; i++) {
            int randomNumber = new Random().nextInt(Constant.RANDOM_BOUND - 2) + 2;
            int m = 2;
            int n = 0;
            while (m * m <= randomNumber && n != 1) {
                if (randomNumber % m == 0) {
                    n = 1;
                }
                m++;
            }
            listAnswerQuestion[i][0] = Integer.toString(randomNumber);
            listAnswerQuestion[i][1] = n == 1 ? "no" : "yes";
        }
        Engine.game(rulesGame, listAnswerQuestion);
    }
}
