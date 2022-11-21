package ShapeDemo;

public class RGB {
    private String red;
    private String green;
    private String blue;
    
    public RGB(String red, String green, String blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "RGB [red=" + red + ", green=" + green + ", blue=" + blue + "]";
    }
    
}
