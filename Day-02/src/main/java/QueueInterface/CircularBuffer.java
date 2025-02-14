package QueueInterface;

import java.util.Arrays;

class CircularBuffer {
    private int[] buffer;
    private int front, rear, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Enqueue operation (Insert element, overwrite if full)
    public void enqueue(int item) {
        rear = (rear + 1) % capacity;
        buffer[rear] = item;

        if (size < capacity) {
            size++;
        } else {
            front = (front + 1) % capacity; // Overwrite oldest element
        }
    }

    // Dequeue operation (Remove the oldest element)
    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Buffer is empty!");
        }
        int item = buffer[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Display buffer contents
    public void display() {
        if (size == 0) {
            System.out.println("Buffer is empty!");
            return;
        }
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.enqueue(1);
        cb.enqueue(2);
        cb.enqueue(3);
        cb.display(); // Output: Buffer: [1, 2, 3]

        cb.enqueue(4); // Overwrites 1
        cb.display(); // Output: Buffer: [2, 3, 4]

        cb.dequeue();
        cb.display(); // Output: Buffer: [3, 4]

        cb.enqueue(5);
        cb.display(); // Output: Buffer: [3, 4, 5]
    }
}

