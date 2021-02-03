public class Circle extends Shape{
    private double radius;
    public Circle(String name) {
        super(name);
    }
    public void setDimensions() {
        this.radius = radius;
    }
    @Override
    public void printDimensions() {
        System.out.println("radius: " + radius);
    }
    @Override
    public double getArea() {
        return (3.14*radius*radius);
    }
}
