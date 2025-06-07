package oops.oops6.generics;

import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static  int DEFAULT_CAPACITY = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_CAPACITY];
    }

    public void add(int value){
        if(size == data.length){
            resize();
        }
        data[size++] = value;
    }

    private void resize(){
        int[] newData = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public int get(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }
        return data[index];
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }
        for (int i = index; i < size-1; i++) {
            data[i] = data[i+1];
        }
        size--;
    }

    public void set(int index, int value){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }
        data[index] = value;
    }

    public int size(){
        return size;
    }


    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);

        for(int i=0; i<14; i++){
            list.add(2*i);
        }

        System.out.println(list);

    }
}
