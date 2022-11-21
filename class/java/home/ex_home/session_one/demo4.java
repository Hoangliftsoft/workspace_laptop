import java.text.DecimalFormat;
import java.util.Scanner;

public class demo4 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Nhap Do c: ");
        int c = scanner.nextInt();
        float f = (float)( c*1.0 * 9/5 ) + 32;
        System.out.println("Do F: " + decimalFormat.format(f));

    }
}
