package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MAX_COUNT_GAME = 3;
    private static final int MAX_RANDOM_BOUND = 100;
    private static final int MIN_RANDOM_BOUND = 0;
    private static final int MIN_SIZE_PROGRESS = 5;
    private static final int MAX_SIZE_PROGRESS = 10;
    private static final int MIN_STEP_PROGRESS = 1;
    private static final String RULES_GAME = "What number is missing in the progression?";
    public static void main() {
        String[][] listAnswerQuestion = new String[MAX_COUNT_GAME][2];

        for (int i = 0; i < MAX_COUNT_GAME; i++) {
            String[] answerQuestion = generateRoundData();
            listAnswerQuestion[i][0] = answerQuestion[0];
            listAnswerQuestion[i][1] = answerQuestion[1];
        }
        Engine.game(RULES_GAME, listAnswerQuestion);
    }
    private static String[] generateRoundData() {
        String[] answerQuestion = new String[2];
        int sizeProgress = Utils.generateNumber(MIN_SIZE_PROGRESS, MAX_SIZE_PROGRESS);
        int firstNumProgress = Utils.generateNumber(MIN_RANDOM_BOUND, MAX_RANDOM_BOUND - sizeProgress);

        int maxBoundProgress = (MAX_RANDOM_BOUND - firstNumProgress) / sizeProgress;
        int stepProgress = Utils.generateNumber(MIN_STEP_PROGRESS, maxBoundProgress);

        String[] progression = generateProgression(firstNumProgress, sizeProgress, stepProgress);
        int randomIndex = Utils.generateNumber(0, sizeProgress - 1);

        answerQuestion[1] = progression[randomIndex];
        progression[randomIndex] = "..";
        answerQuestion[0] = String.join(" ", progression);
        return answerQuestion;
    }
    public static String[] generateProgression(int firstNumProgress, int sizeProgress, int stepProgress) {
        String[] progression = new String[sizeProgress];

        progression[0] = Integer.toString(firstNumProgress);
        for (int j = 1; j < sizeProgress; j++) {
            progression[j] = Integer.toString(Integer.parseInt(progression[j - 1]) + stepProgress);
        }
        return progression;
    }

}
