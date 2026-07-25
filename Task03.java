import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        System.out.println("simple login system");
        String correctUsername = "admin";
        String correctPassword = "admin123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String inputUsername = sc.nextLine();
        System.out.print("Enter your password: ");
        String inputPassword = sc.nextLine();
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Login successful. Welcome, " + inputUsername + "!");
        } else {
            System.out.println("Invalid username or password. Access denied.");
        }
    }
    
}
