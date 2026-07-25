import java.util.Scanner;
public class String_1 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        System.out.println("Length:"+s.length());
        System.out.println("CharAt(0):"+s.charAt(0));
        System.out.println("ToUppercase:"+s.toUpperCase());
        System.out.println("ToLowercase:"+s.toLowerCase());
        System.out.println("Equals:"+s.equals("java"));
        System.out.println("Equals&Ignores case:"+s.equalsIgnoreCase("java"));
        System.out.println("Contains:"+s.contains("pro"));
        System.out.println("Substring:"+s.substring(2));
        System.out.println("Replacing 'A' with '@':"+s.replace('A','@'));
        System.out.println("Trim Spaces:"+s.trim());
        sc.close();
    }
}
