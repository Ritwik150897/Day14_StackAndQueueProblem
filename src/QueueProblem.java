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
    }
}
