package hexlet.code.games;

import hexlet.code.Constant;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void main() {
        String rulesGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] listAnswerQuestion = new String[Constant.MAX_COUNT_GAME][2];
        for (int i = 0; i < Constant.MAX_COUNT_GAME; i++) {
            listAnswerQuestion[i][0] = generateQuestion();
            listAnswerQuestion[i][1] = generateAnswer(listAnswerQuestion[i][0]);
        }
        Engine.game(rulesGame, listAnswerQuestion);
    }
    public static String generateQuestion() {
        int randomNumber = new Random().nextInt(Constant.RANDOM_BOUND);
        return Integer.toString(randomNumber);
    }
    public static String generateAnswer(String question) {
        return (Integer.parseInt(question) % 2 == 0) ? "yes" : "no";
    }
}
