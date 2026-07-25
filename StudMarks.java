import java.util.Scanner;
public class StudMarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String name= sc.nextLine();
        int [] marks=new int[5];
        int max=marks[0];
        int total=0;

        for(int i=0;i<5;i++){
            System.out.println("ENTER MARKS:");
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
        double avg=total/5.0;
        for(int i=0;i<5;i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        int min=marks[0];
        for(int i=0;i<5;i++){
            if(marks[i]<min){
                min=marks[i];
            }

        }
        System.out.println("Student Name:"+name);
        System.out.println("Student Total  Marks:"+total);
        System.out.println("Student Avg Marks:"+avg);
        System.out.println("Maximum Marks:"+max);
        System.out.println("Minimum Marks:"+min);
        boolean pass=true;
        for(int i=0;i<=5;i++){
            if(marks[i]<50)
                pass=false;
            break;
        }
        if(pass)
        {
            System.out.println("Student" +"   " + name + " " +  "is" +"  " + "PASS");
        }
        else {
            System.out.println("Student"+ "   "  + name + "  " +"is" + " " +  "FAIL");
        }






    }

}
