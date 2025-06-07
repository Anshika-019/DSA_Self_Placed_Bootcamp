package bitwiseOperator;

public class Power {
    public static void main(String[] args) {
        int base = 3; // Example number
        int power = 6;
        int ans = 1; // Initialize result to 1

        while (power > 0) {
            if ((power & 1) == 1) { // Check if the current power is odd
                ans *= base; // Multiply the result by the base
            }
            base *= base; // Square the base
            power >>= 1; // Divide power by 2
        }
        System.out.println("The result of " + base + " raised to the power of " + power + " is: " + ans);

    }
}
