import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        
    System.out.println("--TASK-03--");
    Scanner sc2=new Scanner(System.in);
    System.out.println("1.Chicken biryani");
    System.out.println("2.pizza");
    System.out.println("3.burger");
    System.out.println("4.chicken rice");
    System.out.println("5.chicken  noodles");
    System.out.println("6.parotta");
    System.out.println("7.chapathi");
    System.out.println("8.Grill chicken ");
    System.out.println("Enter A Number(1-8):");
    int num2=sc2.nextInt();
    switch(num2){
        case 1:
            System.out.println("Chicken biryani");
            break;
        case 2:
            System.out.println("pizza");
            break;
        case 3:
            System.out.println("burger");
            break;
        case 4:
            System.out.println("chicken rice");
            break;
        case 5:
            System.out.println("chicken  noodles");
            break;
        case 6:
            System.out.println("parotta");
            break;
        case 7:
            System.out.println("chapathi");
            break;
        case 8:
            System.out.println("Grill chicken ");
            break;
        default:
            System.out.println("Invalid Input");
    }
    }
}
