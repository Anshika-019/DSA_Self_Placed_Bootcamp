package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        reverse(12345);
        System.out.println(reverse(12345));

    }
    // 1st method
//    static int sum=0;
//    static  void reverse(int n){
//        if(n==0){
//            return;
//        }
//        int rem=n%10;
//        sum=sum*10+rem;
//        reverse(n/10);
//    }

    // 2nd method
//    static void reverse(int n){
//        if(n==0){
//            return;
//        }
//        System.out.print(n%10);
//        reverse(n/10);
//    }

    // 3rd method
    static int reverse(int n){
        // sometimes you might need some additional variables in the arguments
        // in that case, make another function
        int digits = (int)(Math.log10(n)+1);
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
}
