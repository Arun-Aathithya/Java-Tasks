import java.util.Random;
import java.util.Scanner;
public class Number{
    public static void main(String[] args){
        Random random=new Random();
        Scanner sc = new Scanner(System.in);
        int target=random.nextInt(100)+1;
        int guess;
        System.out.println("Guess a Number:");
        do{
            System.out.println("Enter your Guess:");
            guess=sc.nextInt();
            if(guess<target){
                System.out.println("The number you entered is too low");
            } else if (guess>target) {
                System.out.println("The number you entered is too high");

            }
            else {
                System.out.println("The number you entered is correct");
            }
        }while(guess!=target);
        sc.close();

    }
}
