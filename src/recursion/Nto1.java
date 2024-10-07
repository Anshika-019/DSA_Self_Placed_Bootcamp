package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        // write a function that prints numbers from n to 1
        nTo1(5);
    }
    static void nTo1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        nTo1(n -1);
    }
}
