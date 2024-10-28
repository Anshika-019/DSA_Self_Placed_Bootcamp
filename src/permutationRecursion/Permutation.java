package permutationRecursion;

public class Permutation {
    public static void main(String[] args) {
        permutations("abc", "");


    }

    static void permutations(String s, String ans) {
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String ros = s.substring(0, i) + s.substring(i + 1);
            permutations(ros, ans + ch);
        }
    }
}
