import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isprime = false;
                break;

            }
        }
        if(isprime){
            System.out.println("Prime Number");

        }
        else {
            System.out.println("Not Prime Number");
        }
    }
}
