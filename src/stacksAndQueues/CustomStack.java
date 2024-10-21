package stacksAndQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;


    int pointer = -1;


    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
     pointer++;
        if(pointer >= data.length) {
            return false;
        }
        data[pointer] = item;
        return true;
    }

    public int pop() throws StackException {
        if(pointer == -1) {
            throw new StackException("Stack is empty");
        }
        return data[pointer--];
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    public boolean isFull() {
        return pointer == data.length - 1;
    }

    public int peek() {
        if(pointer == -1) {
            return -1;
        }
        return data[pointer];
    }
}
