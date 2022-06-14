import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueProblem {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(56);
        queue.add(30);
        queue.add(70);

        System.out.println("Queue is: " + queue);
        queue.remove();
        System.out.println("Queue After Removal is: " + queue);

        System.out.println("--------------------");

        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(56);
        deque.add(30);
        deque.addLast(70);

        System.out.println("Deque is: " + deque);
        deque.remove();
        System.out.println("Deque After Removal is:" + deque);
    }
}
