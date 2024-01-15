package ArrayListExercises;

import java.util.ArrayList;

public class Exercise17 {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Student 1: Easin");
        student.add("Student 2: Santo");
        student.add("Student 3: Munna");
        student.add("Student 4: Asif");
        student.add("Student 5: Apple");

        student.clear();

        System.out.println(student);
    }
}
