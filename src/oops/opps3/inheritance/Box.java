package oops.opps3.inheritance;

public class Box {
    double l;
    double b;
    double w;

    Box() {
        this.l = -1;
        this.b = -1;
        this.w = -1;
    }

    // cube
    Box(double side) {
        this.l = side;
        this.b = side;
        this.w = side;
    }

    Box(double l, double b, double w) {
        this.l = l;
        this.b = b;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Length: " + l + " Breadth: " + b + " Width: " + w);
    }
}
