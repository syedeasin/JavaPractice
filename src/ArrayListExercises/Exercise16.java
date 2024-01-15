package ArrayListExercises;

import java.util.ArrayList;

public class Exercise16 {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Student 1: Easin");
        student.add("Student 2: Santo");
        student.add("Student 3: Munna");
        student.add("Student 4: Asif");
        student.add("Student 5: Apple");

        ArrayList<String> student2 = (ArrayList<String>) student.clone();
        System.out.println(student2);
    }
}
