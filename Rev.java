import java.util.Scanner;

public class Rev{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String st = sc.nextLine();

        String rev = "";

        for (int i = st.length() - 1; i >= 0; i--) {
            rev += st.charAt(i);
        }

        System.out.println("Reverse String: " + rev);

        sc.close();
    }
}