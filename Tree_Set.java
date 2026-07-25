import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(80);
        numbers.add(75);
        numbers.add(30);
        numbers.add(95);
        numbers.add(10);

        for (Integer n : numbers) {
            System.out.println(n);
        }
    }
}