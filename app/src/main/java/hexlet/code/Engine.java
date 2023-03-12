package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void game(String rulesGame, String[][] listAnswerQuestion) {
        String playerName;
        Scanner scanner = new Scanner(System.in);
        String wrongAnswer = "'%s' is wrong answer ;(. Correct answer was '%s'";

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(rulesGame);

        for (String[] answerQuestion : listAnswerQuestion) {
            System.out.println("Question: " + answerQuestion[0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();
            if (!playerAnswer.equals(answerQuestion[1])) {
                System.out.printf(wrongAnswer, playerAnswer, answerQuestion[1]);
                System.out.println();
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
