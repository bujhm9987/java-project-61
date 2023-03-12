package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void main() {
        final int maxCountGame = 3;
        String rulesGame = "What number is missing in the progression?";
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
        final int minBound = 6;
        String[] answerQuestion = new String[2];
        int sizeArray = new Random().nextInt(minBound) + minBound - 1;
        int randomIndex = new Random().nextInt(sizeArray);
        String[] progression = generateProgression(sizeArray);

        answerQuestion[1] = progression[randomIndex];
        progression[randomIndex] = "..";
        answerQuestion[0] = String.join(" ", progression);
        return answerQuestion;
    }
    public static String[] generateProgression(int sizeArray) {
        final int randomBound = 100;
        String[] progression = new String[sizeArray];
        int firstNumber = new Random().nextInt(randomBound - sizeArray);
        int maxStepProgress = (randomBound - firstNumber) / sizeArray;
        int rndStepProgress = new Random().nextInt(maxStepProgress) + 1;

        progression[0] = Integer.toString(firstNumber);
        for (int j = 1; j < sizeArray; j++) {
            progression[j] = Integer.toString(Integer.parseInt(progression[j - 1]) + rndStepProgress);
        }
        return progression;
    }

}
