package patternQuestions;

public class Pattern7 {
    public static void main(String[] args) {

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
