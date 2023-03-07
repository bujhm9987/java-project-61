package hexlet.code.games;

import hexlet.code.Constant;
import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void main() {
        String rulesGame = "What number is missing in the progression?";
        String[][] listAnswerQuestion = new String[Constant.MAX_COUNT_GAME][2];
        final int minBound = 6;

        for (int i = 0; i < Constant.MAX_COUNT_GAME; i++) {
            int sizeArray = new Random().nextInt(minBound) + minBound - 1;
            String[] arrayProgression = new String[sizeArray];
            int firstNumber = new Random().nextInt(Constant.RANDOM_BOUND - sizeArray);
            arrayProgression[0] = Integer.toString(firstNumber);
            int maxStepProgress = (Constant.RANDOM_BOUND - firstNumber) / sizeArray;
            int rndStepProgress = new Random().nextInt(maxStepProgress) + 1;
            for (int j = 1; j < sizeArray; j++) {
                arrayProgression[j] = Integer.toString(Integer.parseInt(arrayProgression[j - 1]) + rndStepProgress);
            }
            int randomIndex = new Random().nextInt(sizeArray);

            listAnswerQuestion[i][1] = arrayProgression[randomIndex];
            arrayProgression[randomIndex] = "..";
            listAnswerQuestion[i][0] = String.join(" ", arrayProgression);
        }
        Engine.game(rulesGame, listAnswerQuestion);
    }
}
