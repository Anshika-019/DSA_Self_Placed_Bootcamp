package bitwiseOperator;

public class RangeXOR {
    public static void main(String[] args) {
        int left = 5; // Example left boundary
        int right = 10; // Example right boundary
        int xorResult = rangeXOR(left, right);
        System.out.println("The XOR from " + left + " to " + right + " is: " + xorResult);
    }

    public static int rangeXOR(int left, int right) {
        return xorUpto(right) ^ xorUpto(left - 1);
    }

    private static int xorUpto(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }
}
