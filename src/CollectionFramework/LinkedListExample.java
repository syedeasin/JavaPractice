package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("Honda");
        cars.add("Yamaha");
        cars.add("BMW");
        cars.add(2,"Easin");

        Iterator x = cars.descendingIterator();

        while (x.hasNext()){
            System.out.println("value is: " + x.next());
        }
    }
}
