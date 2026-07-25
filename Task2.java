import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
     System.out.println("--TASK-02--");
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter A Number(1-7):");
    int num1=sc1.nextInt();
    switch(num1){
        case 1:
            System.out.println("Artificial Intelligence and Data Science");
            break;
        case 2:
            System.out.println("Artificial Intelligence and Machine Learning");
            break;
        case 3:
            System.out.println("Computer Science and Engineering");
            break;
        case 4:
            System.out.println("petroleum Engineering");
            break;
        case 5:
            System.out.println("Civil Engineering");
            break;
        case 6:
            System.out.println("Mechanical Engineering");
            break;
        case 7:
            System.out.println("Electrical and Electronics Engineering");
            break;
        default:
            System.out.println("Invalid Input");
    }
    }
}
