import java.util.Scanner;
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("=== Dice Game ===");

        while (true) {

            System.out.print("Enter a number (1-6) or 0 to quit: ");
            int user = sc.nextInt();

            if (user == 0) {
                break;
            }

            if (user < 1 || user > 6) {
                System.out.println("Invalid! Enter a number between 1 and 6.");
                continue;
            }

            int computer = random.nextInt(6) + 1;

            System.out.println("Your Number     : " + user);
            System.out.println("Computer Number : " + computer);

            if (user == computer) {
                System.out.println("Both numbers matched! You Win!");
            } else {
                System.out.println("Not matched. Better luck next time!");
            }

            System.out.println();
        }

        System.out.println("Game Over!");
        sc.close();
    }
}