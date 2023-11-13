package ArrayListExercises;

import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Orange");
        colors.add("Black");
        colors.add("Green");

        colors.add(0,"White");
        colors.add(colors.size(),"Ocean Blue");

        System.out.println(colors);
    }
}
