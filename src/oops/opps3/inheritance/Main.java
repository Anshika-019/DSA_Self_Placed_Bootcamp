package oops.opps3.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(10, 20, 30);
//        Box box2 = new Box(box1);
//        box1.information();
//        box2.information();
//
//        Box box3 = new Box(10);
//        box3.information();

//        BoxWeight boxWeight1 = new BoxWeight(10, 20, 30, 40);
//        BoxWeight boxWeight2 = new BoxWeight(boxWeight1);
//        boxWeight1.information();
//        boxWeight2.information();

        Box box4 = new BoxWeight(10, 20, 30, 40);
        System.out.println(box4.w);


        //there are many variables in the both parent and child classes
        //you are given to access to variables that are in the  ref type  i.e. BoxWeight
        //hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialized in the parent class
        //bur here, w is not initialized in the parent class. when the obj itself is of type parent class, how will you call the constructor of the child class
        //this is not possible. that's why error
//        BoxWeight box5 = new Box(10, 20, 30, 40);
//        System.out.println(box5.w);

    }
}
