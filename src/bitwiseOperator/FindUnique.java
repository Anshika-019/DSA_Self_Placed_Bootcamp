package bitwiseOperator;

public class FindUnique {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1}; // Example array with a unique number
        int uniqueNumber = findUnique(numbers);
        System.out.println("The unique number is: " + uniqueNumber);
    }

    public static int findUnique(int[] numbers) {
        int unique = 0;
        for (int number : numbers) {
            unique ^= number; // Using bitwise XOR to find the unique number
        }
        return unique;
    }
}
