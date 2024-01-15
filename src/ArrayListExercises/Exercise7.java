package ArrayListExercises;

import java.util.ArrayList;

public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Easin");
        name.add("Emon");
        name.add("Eamin");
        name.add("Fahim");
        name.add("Munna");
        name.add("Santo");

        System.out.println(name.contains("Eamin"));
    }
}
