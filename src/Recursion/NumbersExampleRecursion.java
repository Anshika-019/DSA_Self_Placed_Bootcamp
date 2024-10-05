package Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
//        if(n == 6){
//            return;
//        }
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
