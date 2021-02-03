import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Jeff the shape");
        Square square = new Square("Fredrick the square");
        Circle circle = new Circle("Saoirse the circle");
        Triangle triangle = new Triangle("Jes the Triangle");
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("Bronwyn the EquilateralTriangle");

        Shape[] shapes = {shape, square, circle, triangle, equilateralTriangle};

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter Square length: ");
        double value1 = scan.nextDouble();
        System.out.println(" Enter Square height: ");
        double value2 = scan.nextDouble();
        square.setDimensions(value1, value2);

        System.out.println(" Enter Circle radius: ");
        circle.setDimensions(scan.nextDouble());

        System.out.println(" Enter Triangle SideA: ");
        value1 = scan.nextDouble();
        System.out.println(" Enter Triangle SideB: ");
        value2 = scan.nextDouble();
        System.out.println(" Enter Triangle SideC: ");
        triangle.setDimensions(value1, value2, scan.nextDouble());

        System.out.println(" Enter Equilateral Triangle Side length: ");
        equilateralTriangle.setDimensions(scan.nextDouble());

        for (Shape sha : shapes) {
            System.out.println("Name: " + sha.getName());
            sha.printDimensions();
            System.out.println("Area: " + sha.getArea());
        }
    }
}
