package Diem2D;

import java.util.Scanner;

public class test {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] agrs) {
        System.out.print("Nhap x: ");
        float x = sc.nextFloat();
        System.out.print("Nhap y: ");
        float y = sc.nextFloat();
        
        Point2D p = new Point2D(x, y);
        p.move(4, 5);
        System.out.println(p.display());
        System.out.println("Vi tri sau khi di chuyen: " + p.distance(7, 9));
    }
}
