package stringAndStringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("madame "));

    }
    static boolean isPalindrome(String str){
//        int i=0;
//        int j=str.length()-1;
//        while(i<j){
//            if(str.charAt(i)!=str.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;

        if(str==null || str.length()==0){
            return true;
        }
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}



