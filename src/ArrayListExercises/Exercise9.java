package ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise9 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Easin");
        name.add("Santo");
        name.add("Apple");
        name.add("Munna");

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Asif");
        friends.add("Tonmoy");
        friends.add("Tonmoy");
        friends.add("Tonmoy");

        Collections.copy(friends, name);

        System.out.println(name);
        System.out.println(friends);
    }
}
