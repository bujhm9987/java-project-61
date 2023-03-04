package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void main() {
        String rulesGame = "What number is missing in the progression?";
        String[] listQuestion = new String[Engine.MAX_COUNT_GAME];
        String[] listAnswer = new String[Engine.MAX_COUNT_GAME];
        final int minBound = 6;

        for (int i = 0; i < Engine.MAX_COUNT_GAME; i++) {
            int sizeArray = new Random().nextInt(minBound) + minBound - 1;
            String[] arrayProgression = new String[sizeArray];
            int firstNumber = new Random().nextInt(Engine.RANDOM_BOUND - sizeArray);
            arrayProgression[0] = Integer.toString(firstNumber);
            int maxStepProgress = (Engine.RANDOM_BOUND - firstNumber) / sizeArray;
            int rndStepProgress = new Random().nextInt(maxStepProgress) + 1;
            for (int j = 1; j < sizeArray; j++) {
                arrayProgression[j] = Integer.toString(Integer.parseInt(arrayProgression[j - 1]) + rndStepProgress);
            }
            int randomIndex = new Random().nextInt(sizeArray);

            listAnswer[i] = arrayProgression[randomIndex];
            arrayProgression[randomIndex] = "..";
            listQuestion[i] = String.join(" ", arrayProgression);
        }
        Engine.game(rulesGame, listQuestion, listAnswer);
    }
}
