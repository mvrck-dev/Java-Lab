public class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Perimeter is not applicable for Cylinder
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
