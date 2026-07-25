import java.util.ArrayList;

public class Student_Array{
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Rahul");
        students.add("Karthik");
        students.add("Priya");
        students.add("Divya");

        students.remove(1);

        if (students.contains("Arun")) {
            System.out.println("Name exists");
        } else {
            System.out.println("Name does not exist");
        }

        System.out.println(students.size());

        if (students.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
    }
}