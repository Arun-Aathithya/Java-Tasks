import java.util.ArrayList;

public class Replacs_frame {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Arun");
        list.add("Bala");
        list.add("Kavin");
        list.add("Ravi");
        list.add("Priya");

        list.set(2, "Rahul");   // Replace 3rd student

        System.out.println(list);
    }
}