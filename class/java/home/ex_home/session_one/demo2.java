import java.text.DecimalFormat;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] agrs) {
        // 1. khai báo
        final float pi = 3.14f;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        // 2. input
        System.out.println("Nhap ban kinh r: ");
        int radius = scanner.nextInt();

        // 3.calculate
        
        float perimeter = (float)radius * 2 * pi;
        System.out.println("perimeter = " + decimalFormat.format(perimeter));
        
        float area = (float)radius * radius * pi;
        System.out.println("area = " + decimalFormat.format(area));

        // System.out.println(pi);
    }   
}

