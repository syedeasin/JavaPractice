package ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise12 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Santo");
        name.add("Munna");
        name.add("Easin");
        name.add("Apple");
        name.add("Asif");

        List<String> x = name.subList(0,3);
        System.out.println(x);
    }
}
