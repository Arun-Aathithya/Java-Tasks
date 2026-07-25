import java.util.ArrayList;

public class loop_framework {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Arun");
        list.add("Bala");
        list.add("Kavin");
        list.add("Ravi");
        list.add("Priya");

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i)+"  ");
        }
    }
}