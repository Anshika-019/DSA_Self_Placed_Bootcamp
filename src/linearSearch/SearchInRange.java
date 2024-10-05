package linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={18, 12, 9, 14, 77, 50};
        int target = 14;
        int start = 1;
        int end = 4;
        System.out.println(linearSearch(arr, target, start, end));

    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element==target){
                return index;
            }

        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;

    }
}
