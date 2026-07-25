import java.util.Scanner;

public class Task008 {
    static int factorial(int n){
        if (n==1) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        System.out.println("Enter an Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(factorial(num));
    }

}
