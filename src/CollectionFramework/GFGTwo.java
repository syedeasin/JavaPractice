package CollectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class GFGTwo {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Easin");
        pq.add("Santo");
        pq.add("Emon");
        pq.add("Nahid");
        pq.add("Emon");
        pq.add("Asif");

        System.out.println(pq);

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " " + "Working"); // Travarsing Each Element of the Queue
        }
    }
}
