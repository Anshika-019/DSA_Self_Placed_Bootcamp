package stringAndStringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char) ('a'+1));
        System.out.println("a"+1);
        // this is same as after a few steps: "a"+"1"
        // integer will be converted to integer  that will call toString method
        System.out.println("Kumal"+ new ArrayList<>());
        System.out.println("Anshika"+ new Integer(1));

        System.out.println(new ArrayList<>()+ " "+new Integer(1));
    }
}
