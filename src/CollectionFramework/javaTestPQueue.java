package CollectionFramework;

import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class javaTestPQueue {
    public static void main(String[] args) {
        PriorityQueue<String> name = new PriorityQueue<>();
        PriorityQueue<Integer> number = new PriorityQueue<>();

        name.add("Asif");
        name.add("Asid");
        name.add("easin");
        name.add("Apple");

        number.add(1);
        number.add(10);
        number.add(7);
        number.add(5);
        number.add(2);

        System.out.println(number);

        number.add(6);

        System.out.println("number start: ");
        while (Objects.equals(number.isEmpty(), false)) {
            System.out.println(number.peek());
            number.poll();
        }

        System.out.println("name start: ");
        while (Objects.equals(name.isEmpty(), false)) {
            System.out.println(name.peek());
            name.poll();
        }
    }
}
