import java.util.Scanner;
public class TaskAN{
    public static void main(String[] args){
    System.out.println("--TASK-01--");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A Number:");
    int num=sc.nextInt();
    if(num<0){
        System.out.println("The Number is Negative");
    }
    else if(num>0){
        System.out.println("The Number is Positive");
    }
    else{
        System.out.println("The Number is Zero");
    }
    System.out.println("--TASK-02--");
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter Marks:");
    int marks=sc1.nextInt();
    if(marks>=90 && marks<=100){
        System.out.println("GRADE A");
    }
    else if(marks>=80 && marks<90){
        System.out.println("GRADE B");
    }
    else if(marks>=70 && marks<80){
        System.out.println("GRADE C");
    }
    else if(marks>=60 && marks<70){
        System.out.println("GRADE D");
    }
    else if(marks>=50 && marks<60){
        System.out.println("GRADE E");
    }
    else{
        System.out.println("FAIL");
    }
    System.out.println("--TASK-03--");
    Scanner sc2=new Scanner(System.in);
    System.out.println("Enter 3 Numbers:");
    int num1=sc2.nextInt();
    int num2=sc2.nextInt();     
    int num3=sc2.nextInt();
    if(num1>num2 && num1>num3){
        System.out.println("The Largest Number is:"+ num1);
    }
    else if(num2>num1 && num2>num3){
        System.out.println("The Largest Number is:"+ num2);
    }
    else{
        System.out.println("The Largest Number is:"+ num3);
    }
    System.out.println("--TASK-04--");
    Scanner sc3=new Scanner(System.in);
    System.out.println("Enter An Number:");
    int num4=sc3.nextInt();
    if(num4%2==0){
        System.out.println("The Number is Even");
    }
    else{
        System.out.println("The Number is Odd");
    }
    System.out.println("--TASK-05--");
    Scanner sc4=new Scanner(System.in);
    System.out.println("Enter An Username:");
    String username=sc4.nextLine();
    System.out.println("Enter An Password:");
    String password=sc4.nextLine();
    if(username.equals("admin") && password.equals("admin123")){
        System.out.println("USERNAME AND PASSWORD IS CORRECT");
    }
    else{
        System.out.println("INVALID USERNAME OR PASSWORD");
    }
    }
}    