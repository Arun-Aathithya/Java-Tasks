import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        System.out.println("--TASK-05--");
    Scanner sc4=new Scanner(System.in);
    System.out.println("Enter A Character(R/Y/G):");
    char ch=sc4.next().charAt(0);
    switch(ch){
        case 'R','r':
            System.out.println("STOP");
            break;
        case 'Y','y':
            System.out.println("READY");
            break;
        case 'G','g':
            System.out.println("GO");
            break;
        default:
            System.out.println("Invalid Input");
        }

    }
}   

