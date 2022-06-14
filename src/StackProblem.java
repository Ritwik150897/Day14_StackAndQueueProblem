import java.util.Stack;

public class StackProblem {
    public static void main(String[] args) {
        System.out.println("Stack Problem");

        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Stack:" + stack);

        System.out.println("Stack top is: " + stack.peek());

        System.out.println("After Popping from Top (" + stack.pop() + "): " + stack);
        System.out.println("After Popping from Top (" + stack.pop() + "): " + stack);
        System.out.println("After Popping from Top (" + stack.pop() + "): " + stack);
    }
}
