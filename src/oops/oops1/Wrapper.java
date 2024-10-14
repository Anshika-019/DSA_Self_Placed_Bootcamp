package oops.oops1;

public class Wrapper {
    public static void main(String[] args) {
//        int a=10;
//        int b=5;
//        Integer num = 45;

        Integer a = 10;
        Integer b = 5;
        swap(a, b);
        System.out.println("Before swapping: a = " + a + ", b = " + b);
    }


//        final int nums=3;
//        nums=4;  can't change it coz of "final"

    final A divya = new A("Divya");
//    divya.name="Anshika"; // can change it coz of "final"

    // when a non-primitive data type is final, it means that the reference variable can't be changed
//       divya=new A("Anshika");  // can't do sth like this






    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }




/// not swap it coz of "final"


class A {
    final int num = 56;
    String name;

    public A(String name) {
        System.out.println("Object is being created");
        this.name = name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is being destroyed");
//    }
}
}

