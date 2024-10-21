package stacksAndQueues;

public class DynamicQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public DynamicQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            int[] newQueue = new int[2 * capacity];
            int i = 0;
            while (front != rear) {
                newQueue[i++] = queue[front];
                front = (front + 1) % capacity;
            }
            front = 0;
            rear = capacity;
            capacity *= 2;
            queue = newQueue;
        }
        queue[rear] = data;
        rear = (rear + 1) % capacity;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicQueue queue = new DynamicQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        queue.enqueue(60);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.enqueue(70);
        queue.enqueue(80);
        queue.display();
    }
}
