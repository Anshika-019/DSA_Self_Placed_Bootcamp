package backtracking;

public class Maze {
    public static void main(String[] args) {
        // write a function that calculates the number of paths in a maze

        System.out.println(countPaths(3, 3));
        path("", 3, 3);


    }
    static int countPaths(int r, int col){
        if(r == 1 || col == 1){
            return 1;
        }
        int left= countPaths(r - 1, col);
        int right = countPaths(r, col - 1);
        return left + right;
    }

    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p + "D", r - 1, c);
        }
        if(c > 1){
            path(p + "R", r, c - 1);
        }
    }
}
