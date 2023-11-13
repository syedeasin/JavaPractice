package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Customer> customers = new PriorityQueue<>();

        customers.offer(new Customer("Customer 1",14));
        customers.offer(new Customer("Customer 2",20));
        customers.offer(new Customer("Customer 3",22));
        customers.offer(new Customer("Customer 4",32));

        while (!customers.isEmpty()){
            Customer customer = customers.poll();
            serve(customer);
        }
    }
    private static void serve(Customer customer){
        System.out.println("Serving customer - name: " + customer.getName() + " and Age: " +customer.getAge());
    }
}
