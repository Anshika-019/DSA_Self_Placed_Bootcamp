package Recursion;

public class BS {
    public static void main(String[] args) {
        // write a function that searches for a target in a sorted array
        // if found return the index else return -1
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(search(arr, 9, 0, arr.length - 1));

    }
    static int search(int[] arr, int target , int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, end-1);
    }
}
