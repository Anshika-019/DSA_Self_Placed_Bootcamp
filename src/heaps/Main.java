package heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>();
        heap.insert(10);
        heap.insert(20);
        heap.insert(15);
        heap.insert(40);
        heap.insert(50);
        heap.insert(100);
        heap.insert(25);
        heap.insert(45);
        heap.insert(12);
        heap.insert(6);
        heap.insert(8);
        heap.insert(60);
        heap.insert(102);
        heap.insert(200);
        heap.insert(250);
        heap.insert(300);
        heap.insert(400);
        heap.insert(500);

//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}
