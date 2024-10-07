package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba", 0, 4));

    }
    static boolean isPalindrome(String s, int start, int end){
        if(start >= end){
            return true;
        }
        return (s.charAt(start) == s.charAt(end)) && isPalindrome(s, start+1, end-1);
    }
}
