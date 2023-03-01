package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int countGame = 0;
        int randomNumber;
        String checkEven;

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (countGame < 3) {
            randomNumber = (int) (Math.random() * 100);  // генерация числа от 0 до 100
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            checkEven = (randomNumber % 2 == 0) ? "yes" : "no";
            if (checkEven.equals(answer)) {
                countGame++;
                System.out.println("Correct!");
            } else {
                countGame = 4;
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + checkEven + "'");
                System.out.println("Let's try again, " + userName);
            }
        }

        if (countGame == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }
}
