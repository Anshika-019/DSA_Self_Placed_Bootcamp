package stacksAndQueues;

public class CustomQueue {

    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {

        this.data = new int[size];
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
        return end == data.length ;
    }

    public boolean enqueue(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int item = data[0];
        //shift the elemnts to the left
        for (int i = 0; i < end - 1; i++) {
            data[i] = data[i + 1];
        }
        end--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
