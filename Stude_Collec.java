import java.util.HashMap;

public class Stude_Collec {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Add students
        students.put(101, "Monisha");
        students.put(102, "Anu");
        students.put(103, "Priya");

        // Display students
        System.out.println("Student Details:");

        for (Integer rollNo : students.keySet()) {
            System.out.println("Roll No: " + rollNo +
                    ", Name: " + students.get(rollNo));
        }

        // Search student
        int searchRollNo = 102;

        if (students.containsKey(searchRollNo)) {
            System.out.println("\nStudent Found: "
                    + students.get(searchRollNo));
        } else {
            System.out.println("\nStudent Not Found");
        }

        // Remove student
        students.remove(103);

        System.out.println("\nAfter Removing Student:");
        System.out.println(students);
    }
}