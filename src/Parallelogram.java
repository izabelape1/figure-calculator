public class Parallelogram {
    private double a;
    private double b;
    private double h;


    public Parallelogram(double a, double h) {
        this.a = a;
        this.h = h;
    }


    public double parallelogramArea() {
        return a * h;
    }

    public double parallelogramPerimeter() {
        return 2 * (a + h);
    }
}
