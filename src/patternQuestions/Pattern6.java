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
