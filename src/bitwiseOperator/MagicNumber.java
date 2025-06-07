package bitwiseOperator;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 7; // Example input

        int ans =0;
        int base = 5; // The base for the magic number
        while (n > 0) {
            int lastDigit = n & 1; // Get the last bit of n
            ans += lastDigit * base; // Add the corresponding power of 5
            base *= 5; // Move to the next power of 5
            n >>= 1; // Right shift n to process the next bit
        }
        System.out.println("The magic number for " + n + " is: " + ans);

    }


}
