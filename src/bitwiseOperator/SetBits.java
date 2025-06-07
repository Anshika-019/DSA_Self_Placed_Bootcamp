package bitwiseOperator;

public class SetBits {
    public static void main(String[] args) {
        int number = 45; // Example number
        int count = countSetBits(number);
        System.out.println(Integer.toBinaryString(number) + " has " + count + " set bits.");


    }

    public static int countSetBits(int number) {
        int count = 0;
//        while (number > 0) {
//            count += (number & 1); // Check if the least significant bit is set
//            number >>= 1; // Right shift to check the next bit
//        }

        // or try this method
//        while (number > 0) {
//            count++; // Increment count for each set bit
//            number &= (number - 1); // Clear the least significant set bit
//        }

        // or try this method
        while (number > 0) {
            count += number & 1; // Check if the least significant bit is set
            number = number >>> 1; // Right shift to check the next bit (using unsigned right shift)
        }
        return count;
    }
}
