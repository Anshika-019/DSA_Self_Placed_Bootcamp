package patternQuestions;

public class Pattern6 {
    public static void main(String[] args) {
        printPattern(6);

    }

    static void printPattern(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalCols = row > n ? 2*n-row : row;
            int noOfSpaces=n-totalCols;
            for(int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
//                System.out.print(" ");

            }
            System.out.println();

        }
    }
}



class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visited = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(visited[i] == 0) {
                dfs(isConnected, visited, i);
                count++;
            }
        }
        return count;



    }

    public void dfs(int[][] isConnected, int[] visited, int i) {
        for(int j = 0; j < isConnected.length; j++) {
            if(isConnected[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(isConnected, visited, j);
            }
        }
    }
}

