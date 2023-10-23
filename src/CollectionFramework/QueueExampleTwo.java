package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleTwo {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();

        for (int i = 0; i<5; i++)
        {
            queue.add(i);
        }

        //Contents of queue
        System.out.println("Elements of Queue: " + queue);

        //Remove the head of queue
        int x = queue.remove();
        System.out.println("Remove Element: " + x);

        //New Queue after removal
        System.out.println("New Queue after head removal: " + queue);

        //Watch the new queue head
        int head = queue.peek();
        System.out.println("New head of the queue: " + head);

        //Watch the size of the queue
        int size = queue.size();
        System.out.println("Queue Size: " + size);
    }
}
