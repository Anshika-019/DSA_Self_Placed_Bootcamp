package bitwiseOperator;

public class NoOfDigits {
    public static void main(String[] args) {
        int number = 3456;
        int base = 10; // Base for the number system

        int ans =  (int)(Math.log(number) / Math.log(base)) + 1; // Calculate number of digits;
        System.out.println("The number of digits in " + number + " is: " + ans);
    }
}
