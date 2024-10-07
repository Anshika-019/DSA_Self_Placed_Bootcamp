package Recursion;

public class OnetoN {
    public static void main(String[] args) {
        // write a function that prints numbers from 1 to n
        print(5);

    }
    static void print(int n){
        if(n == 0){
            return;
        }
        print(n -1);
        System.out.println(n);

    }
}
