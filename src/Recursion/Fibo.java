package Recursion;

public class Fibo {
    public static void main(String[] args) {
        // write a function that prints fibonacci series
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
        System.out.println(fibonacci(10));

    }

    static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
