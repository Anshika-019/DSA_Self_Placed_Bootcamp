package linearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={18, 12, 9, 14, 77, 50};
        System.out.println(findMin(arr));

    }
    static int findMin(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
