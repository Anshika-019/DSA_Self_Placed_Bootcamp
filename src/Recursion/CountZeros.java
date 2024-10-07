package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(10204));

    }
    static int countZeros(int n){
        if(n==0){
            return 0;
        }
        int count = 0;
        if(n%10 == 0){
            count++;
        }
        return count + countZeros(n/10);
    }
}
