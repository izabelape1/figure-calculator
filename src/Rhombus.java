public class Rhombus {
    private double a;
    private double h;


    public Rhombus(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public Rhombus(double a) {
        this.a = a;
    }

    public double rhombusArea(){
        return a * h;
    }
    public double rhombusPerimeter(){
        return 4 * a;
    }
}
