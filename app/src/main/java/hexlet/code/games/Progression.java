package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void main() {
        Engine.welcome();
        int randomBound = 100;
        int minBound = 6;

        System.out.println("What number is missing in the progression?");

        while (Engine.countGame < 3) {
            int sizeArray = new Random().nextInt(minBound) + 5;
            String[] arrayProgression = new String[sizeArray];
            int firstNumer = new Random().nextInt(randomBound - sizeArray);
            arrayProgression[0] = Integer.toString(firstNumer);
            int maxStepProgress = (randomBound - firstNumer) / sizeArray;
            int rndStepProgress = new Random().nextInt(maxStepProgress) + 1;
            for (int i = 1; i < sizeArray; i++) {
                arrayProgression[i] = Integer.toString(Integer.parseInt(arrayProgression[i - 1]) + rndStepProgress);
            }
            int randomIndex = new Random().nextInt(sizeArray);

            Engine.result = arrayProgression[randomIndex];
            arrayProgression[randomIndex] = "..";
            Engine.question = String.join(" ", arrayProgression);
            Engine.answer();
            Engine.checkResult();
        }
    }

}
