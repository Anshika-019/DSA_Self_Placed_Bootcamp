package patternQuestions;

public class Pattern3 {
    public static void main(String[] args) {
        printPattern(5);

    }

    static void printPattern(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 1; col < n-row+1; col++) {
                System.out.print("* ");
                System.out.print(" ");

            }
            System.out.println();

        }
    }
}
