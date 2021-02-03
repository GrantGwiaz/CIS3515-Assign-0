public class EquilateralTriangle extends Triangle {
    private double sideLength;
    public EquilateralTriangle(String name) {
        super(name);
    }

    public void setDimensions(double sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public void printDimensions() {
        System.out.println("sides length: " + sideLength);
    }
    @Override
    public double getArea() {
        return (sideLength * sideLength * Math.sqrt(3)) / 4;
    }
}
