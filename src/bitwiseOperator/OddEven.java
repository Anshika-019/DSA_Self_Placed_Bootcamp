package bitwiseOperator;

public class OddEven {
    public static void main(String[] args) {
        int number = 6; // Example number
        if (isOdd(number)) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even.");
        }
    }

    public static boolean isOdd(int number) {
        return (number & 1) == 1; // Using bitwise AND to check if the least significant bit is 1
    }
}
