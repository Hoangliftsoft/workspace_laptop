package Diem2D;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    public float distance(float xnew, float ynew) {
        return (float) Math.sqrt(Math.pow((xnew - x), 2) + Math.pow((ynew - y), 2));
    }

    public String display() {
        return "Point2D [x=" + x + ", y=" + y + "]";
    }

}
