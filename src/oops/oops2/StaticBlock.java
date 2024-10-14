package oops.oops2;

//this is a demo to show initialisation of static variables
public class StaticBlock {
    static  int a=2;
    static int b;

    // will only run once, when the first object is created i.e. when the class is loaded for the first time
    static {
        System.out.println("Static block is called");
        b=a*4;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b += 10;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
