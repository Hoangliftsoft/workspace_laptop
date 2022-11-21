import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class demo3 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Nhap x1: ");
        int x1 = scanner.nextInt();
        System.out.println("Nhap x2: ");
        int x2 = scanner.nextInt();
        System.out.println("Nhap y1: ");
        int y1 = scanner.nextInt();
        System.out.println("Nhap y2: ");
        int y2 = scanner.nextInt();

        float cal = (float)Math.sqrt(Math.pow((x2-x1*1.0), 2)+Math.pow((y2-y1*1.0), 2));
        System.out.println("Khoang cach giua hai diem la: "+ decimalFormat.format(cal) );
    }
}
