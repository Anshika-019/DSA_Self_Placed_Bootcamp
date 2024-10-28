package heaps;
import java.util.ArrayList;
import java.util.Arrays;

public class Heap<T extends Comparable<T>> {

    private ArrayList<T>  list;

    public Heap(){
        list = new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent (int index){
        if(index<=0 || index>=list.size()){
            return -1;
        }
        return (index - 1) / 2;
    }

    private int leftChild(int index){
        int left = 2 * index + 1;
        if(left >= list.size()){
            return -1;
        }
        return left;
    }

    private int rightChild(int index){
        int right = 2 * index + 2;
        if(right >= list.size()){
            return -1;
        }
        return right;
    }

    public void insert(T data){
        list.add(data);
        int index = list.size() - 1;
        while(index != 0 && list.get(index).compareTo(list.get(parent(index))) > 0){
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public T remove(){
        if(list.isEmpty()){
            return null;
        }
        T removed = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        heapify(0);
        return removed;
    }

    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest = i;
        if(left != -1 && list.get(left).compareTo(list.get(largest)) > 0){
            largest = left;
        }
        if(right != -1 && list.get(right).compareTo(list.get(largest)) > 0){
            largest = right;
        }
        if(largest != i){
            swap(i, largest);
            heapify(largest);
        }
    }

    public ArrayList<T> heapSort(){
        ArrayList<T> sortedList = new ArrayList<>();
        while(!list.isEmpty()){
            sortedList.add(remove());
        }
        return sortedList;
    }

}
