package ArrayListExercises;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Red");
        colors.add("White");

        for(String element: colors)
        {
            System.out.println(element);
        }
    }
}
