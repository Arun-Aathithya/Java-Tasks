import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
         System.out.println("--TASK-04--");
    Scanner sc3=new Scanner(System.in);
    System.out.println("Enter A Number(1-3):");
    int num3=sc3.nextInt();
    switch(num3){
        case 1:
            System.out.println("Deposit");
            System.out.println("Enter Amount to Deposit:");
            int depositAmount=sc3.nextInt();
            System.out.println("Amount Deposited: " + depositAmount);
            break;
        case 2: 
            System.out.println("Withdrawal");
            System.out.println("Enter Amount to Withdraw:");
            int withdrawAmount=sc3.nextInt();
            System.out.println("Amount Withdrawn: " + withdrawAmount);
            break;
        case 3:
            System.out.println("Balance Enquiry");
            System.out.println("Your Current Balance is: 10000");
            break;
        default:
            System.out.println("Invalid Input");
    }
    }
    
}
