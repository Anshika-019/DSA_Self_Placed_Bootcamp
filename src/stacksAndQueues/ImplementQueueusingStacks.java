package stacksAndQueues;

import java.util.Stack;

public class ImplementQueueusingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public ImplementQueueusingStacks(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void enqueue(int data) {
        first.push(data);
    }

    public int dequeue() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        return second.pop();
    }

    public int peek() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        return second.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty() && second.isEmpty();
    }

    public static void main(String[] args) {
        ImplementQueueusingStacks queue = new ImplementQueueusingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
