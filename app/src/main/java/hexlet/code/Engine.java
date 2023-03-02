package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static Scanner scanner = new Scanner(System.in);
    public static String playerName = new String();
    public static String answer = new String();
    public static String question = new String();
    public static String result = new String();
    public static int countGame = 0;

    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
    }

    public static void answer() {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        answer = scanner.next();
    }

    public static void checkResult() {
        if (result.equals(answer)) {
            countGame++;
            System.out.println("Correct!");
        } else {
            countGame = 4;
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'");
            System.out.println("Let's try again, " + playerName + "!");
        }

        if (countGame == 3) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
}
