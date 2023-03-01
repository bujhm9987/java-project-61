package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int userChoice = Integer.parseInt(scanner.next());

        switch (userChoice) {
            case (0):
                break;
            case (1):
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String userName = scanner.next();
                System.out.println("Hello, " + userName + "!");
                break;
            case (2):
                Even.main();
                break;
            default:
                System.out.println("You entered an invalid game number");
                break;
        }
        scanner.close();
    }
}
