package stringAndStringBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a = "Divya";
        String b = "Divya";
        String c= a;
        System.out.println(a == c);
//        ==
//        System.out.println(a == b);

        String name1 = new String("Divya");
        String name2= new String("Divya");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}
