package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int MAX_COUNT_GAME = 3;
    private static final int RANDOM_BOUND = 100;
    private static final int MIN_BOUND = 6;
    private static final String RULES_GAME = "What number is missing in the progression?";
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
        int sizeArray = new Random().nextInt(MIN_BOUND) + MIN_BOUND - 1;
        int randomIndex = new Random().nextInt(sizeArray);
        String[] progression = generateProgression(sizeArray);

        answerQuestion[1] = progression[randomIndex];
        progression[randomIndex] = "..";
        answerQuestion[0] = String.join(" ", progression);
        return answerQuestion;
    }
    public static String[] generateProgression(int sizeArray) {
        String[] progression = new String[sizeArray];
        int firstNumber = new Random().nextInt(RANDOM_BOUND - sizeArray);
        int maxStepProgress = (RANDOM_BOUND - firstNumber) / sizeArray;
        int rndStepProgress = new Random().nextInt(maxStepProgress) + 1;

        progression[0] = Integer.toString(firstNumber);
        for (int j = 1; j < sizeArray; j++) {
            progression[j] = Integer.toString(Integer.parseInt(progression[j - 1]) + rndStepProgress);
        }
        return progression;
    }

}
