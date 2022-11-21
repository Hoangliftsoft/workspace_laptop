package ShapeDemo;

public class Triangle extends Shape {
    private double base,height;



    public Triangle(RGB color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }

    @Override
    public double getArea() {
        return 0;
    }

    
    
    

}
