package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Even {
    public static void main() {
        String rulesGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] listQuestion = new String[Engine.maxCountGame];
        String[] listAnswer = new String[Engine.maxCountGame];
        for (int i = 0; i < Engine.maxCountGame; i++) {
            int randomNumber = new Random().nextInt(Engine.randomBound);
            listQuestion[i] = Integer.toString(randomNumber);
            listAnswer[i] = (randomNumber % 2 == 0) ? "yes" : "no";
        }
        Engine.game(rulesGame, listQuestion, listAnswer);
    }
}
