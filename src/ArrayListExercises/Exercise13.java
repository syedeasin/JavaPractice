package ArrayListExercises;

import java.util.ArrayList;

public class Exercise13 {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("10");
        firstList.add("20");
        firstList.add("30");
        firstList.add("40");
        firstList.add("50");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("10");
        secondList.add("20");
        secondList.add("30");
        secondList.add("70");
        secondList.add("50");

        ArrayList<String> thirdList = new ArrayList<>();
        for (String x: firstList){
            thirdList.add(secondList.contains(x) ? "Yes" : "No");
        }
        System.out.println(thirdList);
    }
}
