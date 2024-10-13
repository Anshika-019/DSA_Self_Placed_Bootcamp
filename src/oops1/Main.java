package oops1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll no.
        int[] roll = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: roll no. and name and marks


        Student[] students = new Student[5];
//        Student divya;
//        divya = new Student();

        Student divya = new Student( 19, "Divya", 100);
        Student anshika = new Student();
//        divya.rollNo = 1;
//        divya.name = "Divya";
//        divya.marks = 90;

//        divya.changeName("Car lover");
//        divya.greeting();
        System.out.println(divya.rollNo);
        System.out.println(divya.name);
        System.out.println(divya.marks);

        Student random=new Student(divya);
        System.out.println(random.rollNo);

        Student random2=new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name="Something";
        System.out.println(two.name);
    }

}

// create a class Student
//for every single student
class Student{
    int rollNo;
    String name;
    float marks;

    // we need  a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting(){
        System.out.println("Hello "+ this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }
    Student (Student other){
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student(){
        //this is how we call a constructor from another constructor
        // internally: new Student(0, "No name", 0.0f);
      this(0, "No name", 0.0f);
    }

    // Student Arpit = new Student(1, "Arpit", 95.0f);
    // here, this will be replaced with arpit

    Student(int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}
