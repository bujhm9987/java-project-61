package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Gcd {
    public static void main() {
        final int maxCountGame = 3;
        String rulesGame = "Find the greatest common divisor of given numbers.";
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
        int randomNumber1 = new Random().nextInt(randomBound);
        int randomNumber2 = new Random().nextInt(randomBound);

        answerQuestion[0] = randomNumber1 + " " + randomNumber2;
        answerQuestion[1] = generateAnswer(randomNumber1, randomNumber2);
        return answerQuestion;
    }
    public static String generateAnswer(int number1, int number2) {
        int a = number1;
        int b = number2;
        while (a != 0 && b != 0) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return Integer.toString(a + b);
    }
}
