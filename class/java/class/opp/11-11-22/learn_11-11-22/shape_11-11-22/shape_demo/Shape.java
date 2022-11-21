package ShapeDemo;

abstract public class Shape {
    protected RGB color;
    
    public Shape(RGB color) {
        this.color = color;
    }

    abstract public double getArea();

    @Override
    public String toString() {
        return "color=" + color;
    }  
}
