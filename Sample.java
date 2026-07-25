import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("WELCOME\t" +  name +"!!!");
        System.out.println("AGE:" + age);
        System.out.println(name + "  is " + age + " years old.");
        sc.close();
    }
    }
