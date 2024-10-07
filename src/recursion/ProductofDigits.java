package recursion;

public class ProductofDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(12345));

    }
    static int productOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 * productOfDigits(n/10);
    }
}
