package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void main() {
        final int maxCountGame = 3;
        String rulesGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] listAnswerQuestion = new String[maxCountGame][2];
        String[] answerQuestion;

        for (int i = 0; i < maxCountGame; i++) {
            answerQuestion = generateRoundData();
            listAnswerQuestion[i][0] = answerQuestion[0];
            listAnswerQuestion[i][1] = answerQuestion[1];
        }
        Engine.game(rulesGame, listAnswerQuestion);
    }
    private static String[] generateRoundData() {
        final int randomBound = 100;
        String[] answerQuestion = new String[2];
        int randomNumber = new Random().nextInt(randomBound);

        answerQuestion[0] = Integer.toString(randomNumber);
        answerQuestion[1] = (Integer.parseInt(answerQuestion[0]) % 2 == 0) ? "yes" : "no";
        return answerQuestion;
    }
}
