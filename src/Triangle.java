public class Triangle {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double triangleArea() {
        return 0.5 * a * h;
    }

    public double trianglePerimeter() {
        return a + b + c;
    }
}