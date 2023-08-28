import java.util.Scanner;

public class Options {

    double figureArea;
    double figurePerimeter;
    Scanner scanner = new Scanner(System.in);

    public void printOptions(){
        System.out.println("Please select a geometric figure:");
        System.out.println("1 - SQUARE");
        System.out.println("2 - RECTANGLE");
        System.out.println("3 - TRIANGLE");
        System.out.println("4 - RHOMBUS");
        System.out.println("5 - PARALLELOGRAM");
        System.out.println("6 - TRAPEZE");
        System.out.println("7 - CIRCLE");
    }
    public void printCalculateOptions(){
        System.out.println("What do you want to calculate:");
        System.out.println("1 - AREA");
        System.out.println("2 - PERIMETER");
    }
    public void area(int figure) {
        if (figure == 1) {
            System.out.println("Enter the side length.:");
            double a = scanner.nextDouble();
            Square square = new Square(a);
            figureArea = square.squareArea();
            System.out.println("The area of the square is: " + figureArea);
        } else if (figure == 2) {
            System.out.println("Enter the length of the first side: ");
            double a = scanner.nextDouble();
            System.out.println("Enter the length of the second side: ");
            double b = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(a, b);
            figureArea = rectangle.rectangleArea();
            System.out.println("The area of the rectangle is: " + figureArea);
        } else if (figure == 3) {
            System.out.println("Enter the length of the base: ");
            double a = scanner.nextDouble();
            System.out.println("Enter the height: ");
            double h = scanner.nextDouble();
            Triangle triangle = new Triangle(a, h);
            figureArea = triangle.triangleArea();
            System.out.println("The area of the triangle is: " + figureArea);
        } else if (figure == 4) {
            System.out.println("Enter the side length: ");
            double a = scanner.nextDouble();
            System.out.println("Enter the height: ");
            double h = scanner.nextDouble();
            Rhombus rhombus = new Rhombus(a, h);
            figureArea = rhombus.rhombusArea();
            System.out.println("The area of the rhombus is: " + figureArea);
        } else if (figure == 5) {
            System.out.println("Enter the side length: ");
            double a = scanner.nextDouble();
            System.out.println("Enter the height: ");
            double h = scanner.nextDouble();
            Parallelogram parallelogram = new Parallelogram(a, h);
            figureArea = parallelogram.parallelogramArea();
            System.out.println("The area of the parallelogram is: " + figureArea);
        } else if (figure == 6) {
            System.out.println("Enter the length of the first base: ");
            double a = scanner.nextDouble();
            System.out.println("Enter the length of the second base: ");
            double b = scanner.nextDouble();
            System.out.println("Enter the height: ");
            double h = scanner.nextDouble();
            Trapeze trapeze = new Trapeze(a, b, h);
            figureArea = trapeze.trapezeArea();
            System.out.println("The area of the trapeze is: " + figureArea);
        } else if (figure == 7) {
            System.out.println("Enter the radius: ");
            double r = scanner.nextDouble();
            Circle circle = new Circle(r);
            figureArea = circle.circleArea();
            System.out.println("The area of the circle is: " + figureArea);
        } else {
            System.out.println("Invalid number. Try again.");
        }
    }
    public void perimeter(int figure) {
        if (figure == 1) {
            System.out.println("Enter the side length: ");
            double a = scanner.nextDouble();
            Square square = new Square(a);
            figurePerimeter = square.squarePerimeter();
            System.out.println("The perimeter of the square is: " + figurePerimeter);
        } else if (figure == 2) {
            System.out.println("Enter the length of the first side: ");
            double a = scanner.nextDouble();
            System.out.println("Enter the length of the second side: ");
            double b = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(a, b);
            figurePerimeter = rectangle.rectanglePerimeter();
            System.out.println("The perimeter of the rectangle is: " + figurePerimeter);
        } else if (figure == 3) {
            System.out.println("Enter the length of the first side: ");
            double a = scanner.nextDouble();
            System.out.println("Enter the length of the second side: ");
            double b = scanner.nextDouble();
            System.out.println("Enter the length of the third side: ");
            double c = scanner.nextDouble();
            Triangle triangle = new Triangle(a, b, c);
            figurePerimeter = triangle.trianglePerimeter();
            System.out.println("The perimeter of the triangle is: " + figurePerimeter);
        } else if (figure == 4) {
            System.out.println("Enter the side length: ");
            double a = scanner.nextDouble();
            Rhombus rhombus = new Rhombus(a);
            figurePerimeter = rhombus.rhombusPerimeter();
            System.out.println("The perimeter of the rhombus is: " + figurePerimeter);
        } else if (figure == 5) {
            System.out.println("Enter the side length: ");
            double a = scanner.nextDouble();
            System.out.println("Enter the height: ");
            double h = scanner.nextDouble();
            Parallelogram parallelogram = new Parallelogram(a, h);
            figurePerimeter = parallelogram.parallelogramPerimeter();
            System.out.println("The perimeter of the parallelogram is: " + figurePerimeter);
        } else if (figure == 6) {
            System.out.println("Enter the length of the first side: ");
            double a = scanner.nextDouble();
            System.out.println("Enter the length of the second side: ");
            double b = scanner.nextDouble();
            System.out.println("Enter the length of the third side: ");
            double x = scanner.nextDouble();
            System.out.println("Enter the length of the fourth side: ");
            double y = scanner.nextDouble();
            Trapeze trapeze = new Trapeze(a, b, x, y);
            figurePerimeter = trapeze.trapezePerimeter();
            System.out.println("The perimeter of the trapeze is: " + figurePerimeter);
        } else if (figure == 7) {
            System.out.println("Enter the radius: ");
            double r = scanner.nextDouble();
            Circle circle = new Circle(r);
            figurePerimeter = circle.circlePerimeter();
            System.out.println("The perimeter of the circle is: " + figurePerimeter);
        } else {
            System.out.println("Invalid number. Try again.");
        }
    }
}
