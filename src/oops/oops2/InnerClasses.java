package oops.oops2;

public class InnerClasses {
    static class Test{
         String name;

         public Test(String name) {
             this.name = name;
         }
    }

    public static void main(String[] args) {
        Test a= new Test("Divya");
        Test b= new Test("Anshika");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
