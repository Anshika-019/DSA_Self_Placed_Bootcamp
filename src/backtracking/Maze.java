package backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // write a function that calculates the number of paths in a maze

        System.out.println(countPaths(3, 3));
//        path("", 3, 3);
        System.out.println(pathRet("", 3, 3));


    }
    static int countPaths(int r, int col){
        if(r == 1 || col == 1){
            return 1;
        }
        int left= countPaths(r - 1, col);
        int right = countPaths(r, col - 1);
        return left + right;
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(pathRet(p + "D", r - 1, c));
        }
        if(c > 1){
            list.addAll(pathRet(p + "R", r, c - 1));
        }
        return list;
    }
}
