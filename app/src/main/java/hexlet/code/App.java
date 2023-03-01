package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int userChoice = Integer.parseInt(scanner.next());

        switch (userChoice) {
            case (0):
                break;
            case (1):
                Cli.greet();
                break;
            default:
                System.out.println("You entered an invalid game number");
                break;
        }
        scanner.close();
    }

}
