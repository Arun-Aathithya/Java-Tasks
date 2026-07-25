import java.util.Scanner;
public class Course{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("COURSE-NAME:");
        String course=sc.nextLine();
        System.out.println("DURATION:");
        int duration=sc.nextInt();
        System.out.println("COURSE-NAME:" + course);
        System.out.println("COURSE-DURATION:" + duration);
        sc.close();
    }
}