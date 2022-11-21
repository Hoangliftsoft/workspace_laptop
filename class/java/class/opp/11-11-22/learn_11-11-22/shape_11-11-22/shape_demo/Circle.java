package ShapeDemo;

public class Circle extends Shape {
    private double radius;
    private RGB coler;
    private String name;

    public Circle(RGB color, double radius, RGB coler, String name) {
        super(color);
        this.radius = radius;
        this.coler = coler;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", coler=" + coler + ", name=" + name + "]";
    }

    @Override
    public double getArea() {
        return 0;
    }
}
