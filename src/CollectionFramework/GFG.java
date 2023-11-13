package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class GFG {
    public static void main(String[] args) {
        Queue<String> queueName = new PriorityQueue<>();

//        queueName.add("Geeks");
//        queueName.add("For");
//        queueName.add("Geeks");

        queueName.add("Easin");
        queueName.add("Munna");
        queueName.add("Santo");
        queueName.add("Asif");
        queueName.add("Apple");
        queueName.add("Nahid");

        System.out.println("Element of Queue: " + queueName);

        //Remove Any single element
        queueName.remove("Munna");
        System.out.println("After Removing Munna: " + queueName);

        //Poll Method
        queueName.poll();
        System.out.println("Checking the poll output: " + queueName);

    }

}
