package ArrayListExercises;

import java.util.ArrayList;

public class Exercise5 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Easin");
        name.add("Emon");
        name.add("Eamin");
        name.add("Fahim");
        name.add("Munna");
        name.add("Santo");

        //Remove an Element
        name.remove("Fahim");
        name.remove(1);
        System.out.println(name);
    }
}
