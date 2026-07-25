import java.util.LinkedList;

public class Linked_list{
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Chennai");
        cities.add("Coimbatore");
        cities.add("Madurai");
        cities.add("Trichy");
        cities.add("Salem");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
        System.out.println("After Adding Banglore at first");

        cities.addFirst("Bangalore");
        System.out.println(cities);
        System.out.println("After Adding hyderabad at last");

        cities.addLast("Hyderabad");
        System.out.println(cities);

        cities.removeFirst();
        cities.removeLast();
        System.out.println("After change Erode");

        cities.set(2, "Erode");
        System.out.println(cities);

        if (cities.contains("Chennai")) {
            System.out.println("Chennai is present in the list.");
        } else {
            System.out.println("Chennai is not present in the list.");
        }
    }
}