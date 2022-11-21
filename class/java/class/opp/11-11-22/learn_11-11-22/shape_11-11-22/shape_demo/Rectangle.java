package ShapeDemo;

public class Rectangle extends Shape{
    private int length, width;


    
    public Rectangle(RGB color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    @Override
    public String toString() {
        return "length=" + length + ", width=" + width + ", color:"+color;
    }
    
    
    
}
