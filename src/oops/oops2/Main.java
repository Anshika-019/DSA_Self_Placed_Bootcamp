package oops.oops2;

public class Main {
    public static void main(String[] args) {
        Human  divya = new Human(19, "Divya", 100000, false);
        Human anshika = new Human(24, "Anshika", 100000, false);

        System.out.println(Human.population);
        System.out.println(Human.population);

//        greeting();

    }

    //this is not dependent on objects
    static void  fun(){
//        greeting();// you cant use this coz it required an instance but the function you are using it in does on instance

        // you cant access non-static stuff without referencing their instances in a static context

        //hence, here I am refrerencing the instance of the class
        Main obj = new Main();
        obj.greeting();

    }

    // we know that sth which is not static , belong to an object
    void greeting(){
        System.out.println("Hello ");
    }
}
