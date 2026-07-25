import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Ex {
    public static  void main(String[] args) {
        ArrayList <String>list=new ArrayList<>();
        list.add("Java");
        list.add("Pythan");
        list.add("C++");
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
