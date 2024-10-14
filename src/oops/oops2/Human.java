package oops.oops2;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population ;

    static void message(){
        System.out.println("Hello");
//        System.out.println(this.name); // cant use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population++;
    }
}
