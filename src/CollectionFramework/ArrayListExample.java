package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("Toyta");
        cars.add("BMW");
        cars.add("Mazeda");


//        System.out.println(cars);
//        System.out.println(cars.get(0));
//        System.out.println(cars.remove(1));
//        System.out.println(cars.set(1,"Yamaha"));
//        System.out.println(cars);

        Collections.sort(cars);
        System.out.println(cars);
        

    }
}
