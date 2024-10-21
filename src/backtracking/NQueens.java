package backtracking;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));

    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        //placing the queen and checking for every row and col
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for (int i = 0; i <= row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        //check for the left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <=maxLeft ; i++) {
            if(board[row-i][col-i]){
                return false;
            }

        }

        //check for the right diagonal
        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 1; i <= maxRight ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                System.out.print(element ? "Q " : "X ");
            }
            System.out.println();
        }
        System.out.println();
    }
}




//public class Solution {
//    public List<List<String>> solveNQueens(int n) {
//        List<List<String>> res = new ArrayList<>();
//        char[][] board = new char[n][n];
//        for (char[] row : board) {
//            Arrays.fill(row, '.');
//        }
//        solve(board, 0, res);
//        return res;
//
//    }
//
//    private void solve(char[][] board, int i, List<List<String>> res) {
//        if (i == board.length) {
//            res.add(construct(board));
//            return;
//        }
//
//        for (int j = 0; j < board.length; j++) {
//            if (isValid(board, i, j)) {
//                board[i][j] = 'Q';
//                solve(board, i + 1, res);
//                board[i][j] = '.';
//            }
//        }
//
//
//    }
//
//    private boolean isValid(char[][] board, int i, int j) {
//
//        for (int k = 0; k < i; k++) {
//            if (board[k][j] == 'Q') {
//                return false;
//            }
//        }
//
//        for (int k = i - 1, l = j - 1; k >= 0 && l >= 0; k--, l--) {
//            if (board[k][l] == 'Q') {
//                return false;
//            }
//        }
//
//        for (int k = i - 1, l = j + 1; k >= 0 && l < board.length; k--, l++) {
//            if (board[k][l] == 'Q') {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    private List<String> construct(char[][] board) {
//        List<String> res = new ArrayList<>();
//        for (char[] row : board) {
//            res.add(new String(row));
//        }
//        return res;
//    }
//
//
//}
