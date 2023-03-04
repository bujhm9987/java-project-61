package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int maxCountGame = 3;
    public static final int randomBound = 100;

    public static void game(String rulesGame, String[] listQuestion, String[] listAnswer) {
        String playerName;
        Scanner scanner = new Scanner(System.in);
        int countGame = 0;
        int i = 0;

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(rulesGame);

        while (countGame < 3) {
            System.out.println("Question: " + listQuestion[i]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();
            if (playerAnswer.equals(listAnswer[i])) {
                countGame++;
                System.out.println("Correct!");
            } else {
                countGame = 4;
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + listAnswer[i] + "'");
                System.out.println("Let's try again, " + playerName + "!");
            }
            i++;
        }

        if (countGame == 3) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
}
