package recursion;

public class Powerof3 {
    public static void main(String[] args) {
        Powerof3 powerof3 = new Powerof3();
        System.out.println(powerof3.isPowerOfThree(27));

    }

    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        if(n%3 != 0 || n==0){
            return false;
        }
        return isPowerOfThree(n/3);

    }

}
