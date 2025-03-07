public abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void displayShape() {
        System.out.println("\nShape Selected: " + shapeName);
    }
}
