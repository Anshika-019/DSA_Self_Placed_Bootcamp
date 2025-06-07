package bitwiseOperator;

public class FlipAndInvertImage {

    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // Flip the row
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                // Swap elements
                int temp = row[i];
                row[i] = row[row.length - 1 - i];
                row[row.length - 1 - i] = temp;
            }
            // Invert the row
            for (int i = 0; i < row.length; i++) {
                row[i] ^= 1; // Invert using XOR with 1
            }
        }
        return image;

    }
}
