package stacksAndQueues;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(12);
//        stack.push(24);
//        stack.push(36);
//        stack.push(48);
//        stack.push(60);
//
//        stack.pop();
//        stack.pop();
//        System.out.println(stack);

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(12);
//        queue.add(24);
//        queue.add(36);
//        queue.add(48);
//        queue.add(60);
//        queue.poll();
//        System.out.println(queue);

        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.add(12);
        dequeue.add(24);
        dequeue.add(36);
        dequeue.add(48);
        dequeue.add(60);
        dequeue.poll();
        System.out.println(dequeue);
    }
}
