package linearSearch;

import java.sql.Array;
import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Harry";
        char target = 'a';
//        System.out.println(searchInString(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));;


    }

    static boolean searchInString2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (char ch : str.toCharArray()) {
            if(ch==target){
                return true;
            }
        }
        return false;
    }


    static boolean searchInString(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
