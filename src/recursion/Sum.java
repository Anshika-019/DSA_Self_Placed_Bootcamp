package Recursion;

public class Sum {
    public static void main(String[] args) {
        // write a function that calculates the sum of numbers from 1 to n
        System.out.println(sum(5));

    }
    static int sum(int n){
        if(n <=1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
