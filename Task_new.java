import java.util.Random;
import java.util.Scanner;

public class Task_new {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String [] choices={"ROCK","PAPER","SCISSORS"};
        System.out.println("1-ROCK\n");
        System.out.println("2-PAPER\n");
        System.out.println("3-SCISSORS\n");
        System.out.println("ENTER YOUR CHOICE(1-3):");
        int userchoice=sc.nextInt();
        int computerchoice=random.nextInt(3)+1;
        System.out.println("YOU CHOSE:"+choices[userchoice-1]);
        System.out.println("COMPUTER CHOSE:"+choices[computerchoice-1]);
        if(userchoice==computerchoice){
            System.out.println("YOUR MATCH IS DRAW\n");
        } else if (userchoice==1 && computerchoice==3 || userchoice==2 && computerchoice==1|| userchoice==3 && computerchoice==2) {
            System.out.println("YOU ARE WINNER\n");
        }
        else{
            System.out.println("COMPUTER WINS");
        }
        sc.close();
    }
}
