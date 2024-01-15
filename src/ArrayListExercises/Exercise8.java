package ArrayListExercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Easin");
        name.add("Emon");
        name.add("Eamin");
        name.add("Fahim");
        name.add("Munna");
        name.add("Santo");

        Collections.sort(name);

        System.out.println(name);
    }
}
