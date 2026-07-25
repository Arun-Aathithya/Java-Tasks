import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
    int a=10;
    int b=25;
    System.out.println("--TASK-01--");
    System.out.println("ADDITION:" + (a+b));
    System.out.println("SUBTRACTION:" + (a-b)); 
    System.out.println("MULTIPLICATION:" + (a*b));
    System.out.println("DIVISION:" + (a/b));
    System.out.println("MODULUS:" + (a%b));
    System.out.println("--TASK-02--");
    int x=50;
    System.out.println("x="+ x);
    System.out.println("x+=20:"+(x+20));
    System.out.println("x-=15:"+(x-15));
    System.out.println("x*=2:"+(x*2));
    System.out.println("x/=5:"+(x/5));
    System.out.println("x%=3:"+(x%3));
    System.out.println("--TASK-03--");
    int a1=30;
    int b1=20;
    System.out.println("Comparison Operators");
    System.out.println("b=" + b1);   
    System.out.println("a!=b:"+ (a1!=b1));
    System.out.println("a>b:"+ (a1>b1));  
    System.out.println("a<b:"+ (a1<b1));
    System.out.println("a>=b:"+ (a1>=b1));
    System.out.println("a<=b:"+ (a1<=b1));
    System.out.println("--TASK-04--");
    boolean isStudent=true;
    boolean hasId=false;
    System.out.println("isStudent&&hasId:"+ (isStudent&&hasId));
    System.out.println("isStudent||hasId:"+ (isStudent||hasId));
    System.out.println("!isStudent:"+ (!isStudent));
    System.out.println("!hasId:"+ (!hasId));
    System.out.println("--TASK-05--");
    int num=5;
    System.out.println("increment and decrement operators");
    System.out.println("++num="+ (++num));
    System.out.println("num++="+ (num++));
    System.out.println("--num="+ (--num));
    System.out.println("num--="+ (num--));
    System.out.println("--TASK-06--");
    int a2=20;
    int b2=40;
    System.out.println("Bitwise Operators");
    System.out.println("a&b:"+(a2&b2));
    System.out.println("a|b:"+(a2|b2));
    System.out.println("a^b:"+(a2^b2));
    System.out.println("~a:"+(~a2));
    System.out.println("a<<b:"+(a2<<b2));
    System.out.println("a>>b:"+(a2>>b2));
    System.out.println("a>>>b:"+(a2>>>b2));
    System.out.println("--TASK-07-a-");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Age:");
    int age=sc.nextInt();
    System.out.println("TERNARY OPERATION");
    System.out.println("AGE>18:"+(age>=18?"ELIGIBLE TO VOTE":"NOT ELIGIBLE TO VOTE"));
    System.out.println("--TASK-07-b-");
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter your MARKS:");
    int marks=sc1.nextInt();
    System.out.println("YOU " +(marks>=50?"PASS":"I AM SORRY,FAIL"));
    System.out.println("If-Else Statement");
    Scanner sc2=new Scanner(System.in);
    System.out.println("Enter your MARKS:");
    int marks1=sc2.nextInt();
    if(marks1>=90 && marks1<=100){
        System.out.println("GRADE A");
    }
    else if(marks1>=80 && marks1<90){
        System.out.println("GRADE B");
    }
    else if(marks1>=70 && marks1<80){
        System.out.println("GRADE C");
    }
    else if(marks1>=60 && marks1<70){
        System.out.println("GRADE D");
    }
    else if(marks1>=50 && marks1<60){
        System.out.println("GRADE E");
    }
    else{
        System.out.println("FAIL");
    }


    
}
}