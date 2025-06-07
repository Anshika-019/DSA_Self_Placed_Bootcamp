package bitwiseOperator;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=16; // fixed for n=0;
        boolean ans= (n&(n-1))==0;
        System.out.println("Is " + n + " a power of two? " + ans);
    }
}
