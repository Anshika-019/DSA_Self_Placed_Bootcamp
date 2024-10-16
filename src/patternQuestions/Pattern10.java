package patternQuestions;

public class Pattern10 {
    public static void main(String[] args) {
        printPattern(5);

    }
    static void printPattern(int n){
        for (int row = 0; row <= 2*n; row++) {
            for (int col = 0; col <= 2*n; col++) {
                int atEveryIndex =  n - Math.min(Math.min(row, col), Math.min(2*n-row, 2*n-col));
                System.out.print(atEveryIndex + " ");

            }
            System.out.println();

        }
    }
}
