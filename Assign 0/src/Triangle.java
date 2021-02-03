import java.lang.Math;
public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle(String name) {
        super(name);
    }
    public void setDimensions(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public void printDimensions() {
        System.out.println("side A: " + sideA + ", side B: " + sideB + ", side C: " + sideC);
    }
    public double getArea() {
        double s = (sideA+sideB+sideC)/2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

    }
}
