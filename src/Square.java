public class Square {
    private double a;

    public Square(double a) {

        this.a = a;
    }

    public double squareArea() {
        return a * a;
    }

    public double squarePerimeter() {
        return 4 * a;
    }
}