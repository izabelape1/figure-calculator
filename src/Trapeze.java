public class Trapeze {
    private double a;
    private double b;
    private double x;
    private double y;
    private double h;

    public Trapeze(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Trapeze(double a, double b, double x, double y) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
    }

    public double trapezeArea(){
        return 0.5 * (a + b) * h;
    }

    public double trapezePerimeter(){
        return a + b + x + y;
    }
}