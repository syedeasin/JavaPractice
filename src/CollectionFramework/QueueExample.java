package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Easin");
        queue.add("Santo");
        queue.add("Munna");

        System.out.println("Queue: " + queue);

        //Remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Remove Element: " + front);

        //Print the updated Queue
        System.out.println("Queue After Removal: " + queue);

        //Add another element to the queue
        queue.add("Mahmud");

        //Peek the element at the front of the queue
        String peeked = queue.peek();
        System.out.println(peeked);

        //Print the Updated Queue
        System.out.println("Queue after peek: " + queue);
    }
}
