package patternQuestions;

public class Pattern4 {
    public static void main(String[] args) {
        printPattern(6);

    }

    static void printPattern(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
                System.out.print(" ");

            }
            System.out.println();

        }
    }
}
