package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListLearning {
    public static void main(String[] args) {
        Queue<Integer> num = new LinkedList<>();

        num.add(10);
        num.add(13);
        num.add(11);

        num.peek();
        num.poll();
        System.out.println(num);
    }
}
