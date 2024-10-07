package Recursion;

public class Nto1toN {
    public static void main(String[] args) {
        // write a function that prints numbers from n to 1 and then from 1 to n
        Nto1toN(5);

    }
    static void Nto1toN(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Nto1toN(n -1);
        System.out.println(n);
    }
}
