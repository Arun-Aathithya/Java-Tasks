import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    static int wins = 0;
    static int losses = 0;
    static int draws = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "yes";
        
        System.out.println("=== Welcome to Rock Paper Scissors ===");
        System.out.println("Type 'rock', 'paper', or 'scissors' to play");
        System.out.println("Type 'quit' to stop and see results\n");
        
        while (!playAgain.equalsIgnoreCase("quit")) {
            System.out.print("Enter your choice (rock/paper/scissors/quit): ");
            String userChoice = scanner.nextLine().toLowerCase().trim();
            
            if (userChoice.equalsIgnoreCase("quit")) {
                break;
            }
            
            // Validate user input
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Please enter rock, paper, or scissors.\n");
                continue;
            }
            
            // Generate computer choice
            String computerChoice = getComputerChoice(random);
            
            // Display choices
            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);
            
            // Determine winner
            determineWinner(userChoice, computerChoice);
            
            System.out.println();
        }
        
        // Display final results
        displayResults();
        scanner.close();
    }
    
    // Method to generate random computer choice
    static String getComputerChoice(Random random) {
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "rock";
        }
    }
    
    // Method to determine winner and update scores
    static void determineWinner(String user, String computer) {
        if (user.equals(computer)) {
            System.out.println("Result: DRAW! 🤝");
            draws++;
        }
        else if (user.equals("rock") && computer.equals("scissors")) {
            System.out.println("Result: YOU WIN! 🎉");
            wins++;
        }
        else if (user.equals("paper") && computer.equals("rock")) {
            System.out.println("Result: YOU WIN! 🎉");
            wins++;
        }
        else if (user.equals("scissors") && computer.equals("paper")) {
            System.out.println("Result: YOU WIN! 🎉");
            wins++;
        }
        else {
            System.out.println("Result: YOU LOSE! 😢");
            losses++;
        }
    }
    
    // Method to display final results
    static void displayResults() {
        System.out.println("\n=== FINAL RESULTS ===");
        System.out.println("Total Games Played: " + (wins + losses + draws));
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        
        if (wins > losses) {
            System.out.println("\n🏆 Congratulations! You won more games!");
        }
        else if (losses > wins) {
            System.out.println("\n🤖 The computer won more games!");
        }
        else if (wins + losses > 0) {
            System.out.println("\n⚖️ It's a tie overall!");
        }
        else {
            System.out.println("\nNo games played.");
        }
    }
}
