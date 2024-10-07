package arrayRecursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int target = 5;
        System.out.println(linearSearch(arr, 0, target));

    }

    public static int linearSearch(int[] arr, int idx, int target) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return linearSearch(arr, idx + 1, target);
    }
}
