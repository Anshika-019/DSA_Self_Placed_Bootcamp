package linearSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
int[][] arr = {
                {18, 12, 9},
                {14, 77, 50},
                 {11, 25, 35, 41},
                {10, 20, 30, 40, 50}
        };
        int target = 25;
        int[] ans = search(arr, target);
        System.out.println(ans[0] + " " + ans[1]);

    }

    // this function returns an array of size 2, that contains the row and column index of the target element
    // if the target element is found
    // otherwise, it returns {-1, -1}

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
