import java.util.HashSet;

public class Hash_Task {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("HTML");
        set.add("CSS");
        set.add("Java");
        set.add("Python");
        set.add("JS");

        set.remove("CSS");

        if (set.contains("JS")) {
            System.out.println("JS is present");
        } else {
            System.out.println("JS is not present");
        }

        System.out.println(set.size());
    }
}