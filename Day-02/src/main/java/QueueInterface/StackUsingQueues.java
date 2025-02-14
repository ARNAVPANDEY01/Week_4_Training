package QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        q1.add(x);
    }

    // Pop element from stack
    public int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }

        // Move n-1 elements to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Last element is the "top" element, so remove it
        int topElement = q1.poll();

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Get the top element
    public int top() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }

        // Move n-1 elements to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Last element is the "top" element
        int topElement = q1.peek();
        q2.add(q1.poll());  // Move it to q2

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class StackUsingQueues {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 2
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
