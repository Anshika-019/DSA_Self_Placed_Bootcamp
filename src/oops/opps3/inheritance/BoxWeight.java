package oops.opps3.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(double l, double b, double w, double weight) {
        super(l, b, w); // what is this? super() is used to call the constructor of the parent class
        //used to initialize the parent class variables
        this.weight = weight;
    }

    BoxWeight(BoxWeight old) {
        super(old);
        this.weight = old.weight;
    }

    public void information() {
        super.information();
        System.out.println("Weight: " + weight);
    }
}
