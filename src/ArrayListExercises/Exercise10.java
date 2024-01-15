package ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise10 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Easin");
        name.add("Santo");
        name.add("Apple");
        name.add("Munna");

        System.out.println(name);
        Collections.shuffle(name);
        System.out.println(name);
    }
}
