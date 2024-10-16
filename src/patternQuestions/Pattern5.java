package patternQuestions;

public class Pattern5 {
    public static void main(String[] args) {
        printPattern(6);

    }

    static void printPattern(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalCols = row > n ? 2*n-row : row;
            for (int col = 1; col <= totalCols; col++) {
                    System.out.print("* ");
                    System.out.print(" ");

            }
            System.out.println();

        }
    }
}
