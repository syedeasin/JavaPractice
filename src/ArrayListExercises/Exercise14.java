package ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise14 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(12);
        number.add(11);
        number.add(13);
        number.add(14);

        Collections.swap(number,2,1);
        System.out.println(number);
    }
}
