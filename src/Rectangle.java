public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double rectangleArea() {
        return a * b;
    }

    public double rectanglePerimeter() {
        return (2 * a) + (2 * b);
    }
}