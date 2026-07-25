import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        System.out.println("Password Verification");
        String correctPassword = "password123";
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter your password: ");
            String inputPassword = sc.nextLine();
            if (inputPassword.equals(correctPassword)) {
                System.out.println("Access granted.");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect password. Attempts left: " + (3 - attempts));
            }
        }
        if (attempts == 3) {
            System.out.println("Too many incorrect attempts. Access denied.");
        }
    }
}
