package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");

        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String userChoice = scanner.next();

        switch (userChoice) {
            case ("0"):
                break;
            case ("1"):
                Engine.welcome();
                break;
            case ("2"):
                Even.main();
                break;
            case ("3"):
                Calc.main();
                break;
            case ("4"):
                Gcd.main();
                break;
            case ("5"):
                Progression.main();
                break;
            case ("6"):
                Prime.main();
                break;
            default:
                System.out.println("You entered an invalid game number");
                break;
        }
        scanner.close();
    }
}
