package ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise11 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Santo");
        name.add("Munna");
        name.add("Easin");
        name.add("Apple");
        name.add("Asif");

        Collections.reverse(name);
        System.out.println(name);
    }
}
