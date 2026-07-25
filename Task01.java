import java.util.Scanner;
public class Task01{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ATM SIMULATION");
        double balance=10000;
        do{
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your balance is: "+balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit=sc.nextDouble();
                    balance+=deposit;
                    System.out.println("Amount deposited successfully.");
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw=sc.nextDouble();
                    if(withdraw>balance){
                        System.out.println("Insufficient balance.");
                    }else{
                        balance-=withdraw;
                        System.out.println("Amount withdrawn successfully.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                }
        }while(true);
    }
}
