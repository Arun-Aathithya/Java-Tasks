import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter the marks:");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int max = marks[0];

        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
            int avg=total/n;

        System.out.println("Total: " + total);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + avg);

        sc.close();
    }
}