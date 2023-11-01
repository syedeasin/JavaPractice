package ArrayListExercises;

import java.util.ArrayList;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Easin");
        name.add("Emon");
        name.add("Eamin");
        name.add("Fahim");

        //Retrive an Element
        String x = name.get(name.size()-1);

        System.out.println(x);
    }
}
