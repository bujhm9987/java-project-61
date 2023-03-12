package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final int MAX_COUNT_GAME = 3;
    private static final int RANDOM_BOUND = 100;
    private static final String RULES_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void main() {
        String[][] listAnswerQuestion = new String[MAX_COUNT_GAME][2];
        String[] answerQuestion;

        for (int i = 0; i < MAX_COUNT_GAME; i++) {
            answerQuestion = generateRoundData();
            listAnswerQuestion[i][0] = answerQuestion[0];
            listAnswerQuestion[i][1] = answerQuestion[1];
        }
        Engine.game(RULES_GAME, listAnswerQuestion);
    }
    private static String[] generateRoundData() {
        String[] answerQuestion = new String[2];
        int randomNumber = new Random().nextInt(RANDOM_BOUND);

        answerQuestion[0] = Integer.toString(randomNumber);
        answerQuestion[1] = (Integer.parseInt(answerQuestion[0]) % 2 == 0) ? "yes" : "no";
        return answerQuestion;
    }
}
