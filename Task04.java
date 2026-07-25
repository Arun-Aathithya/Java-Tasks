import java.util.Scanner;
import java.util.Random;

public class Task04{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int wins = 0, losses = 0, draws = 0;

        while (true) {

            System.out.print("Enter rock, paper, scissors or quit: ");
            String user = sc.nextLine().toLowerCase();

            if (user.equals("quit")) {
                break;
            }

            if (!user.equals("rock") && !user.equals("paper") && !user.equals("scissors")) {
                System.out.println("Invalid Choice!");
                continue;
            }

            int n = random.nextInt(3);
            String computer;

            if (n == 0)
                computer = "rock";
            else if (n == 1)
                computer = "paper";
            else
                computer = "scissors";

            System.out.println("You      : " + user);
            System.out.println("Computer : " + computer);

            if (user.equals(computer)) {
                System.out.println("Draw!");
                draws++;
            }
            else if ((user.equals("rock") && computer.equals("scissors")) ||
                     (user.equals("paper") && computer.equals("rock")) ||
                     (user.equals("scissors") && computer.equals("paper"))) {
                System.out.println("You Win!");
                wins++;
            }
            else {
                System.out.println("You Lose!");
                losses++;
            }

            System.out.println();
        }

        System.out.println("\nGame Over");
        System.out.println("Wins   : " + wins);
        System.out.println("Losses : " + losses);
        System.out.println("Draws  : " + draws);

        sc.close();
    }
}