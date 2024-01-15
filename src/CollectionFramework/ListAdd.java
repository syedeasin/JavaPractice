package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class ListAdd {
    public static void main(String[] args) {
        Queue<Integer> number = new PriorityQueue<>();
        number.add(100);
        number.add(99);
        number.add(101);

        System.out.println(number);

        System.out.println();

    }
}
