import java.util.Scanner;
public class Bmi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your height in metre");
        float height=sc.nextFloat();
        System.out.println("Enter your weight in kilogram");
        double weight=sc.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("Your BMI is "+bmi);



    }
}
