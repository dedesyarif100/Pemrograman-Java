// Queue
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        // Queue<String> queue = new ArrayDeque<>(10);
        // Queue<String> queue = new PriorityQueue<>();
        Queue<String> queue = new LinkedList<>();

        // for (int i = 0; i < 20; i++) {
        //     queue.add(String.valueOf(i));
        // }

        queue.add("E");
        queue.add("C");
        queue.add("A");
        // System.out.println(queue.poll());
        for (String next = queue.poll(); next != null; next = queue.poll()) {
            // System.out.print(queue.poll() + ", ");
            System.out.print(next + ", ");
        }

        System.out.println(queue.size());
    }
}