package ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise15 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("F");
        list2.add("G");
        list2.add("H");
        list2.add("I");
        list2.add("J");
        list2.add("K");

        list.addAll(list2);

        System.out.println(list);
    }
}
