package linearSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 24, 36, 48, 60};
        int target = 36;
        System.out.println(linearSearch(arr, target));
    }

    static boolean linearSearch3(int[] arr, int target){
        if(arr.length==0){
            return false;
        }
        for (int element : arr) {
            if(element==target){
                return true;
            }

        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;

    }



    // search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int element : arr) {
            if(element==target){
                return element;
            }

        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;

    }

    // search in the array: return the index if found, else return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index <= arr.length; index++) {
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
