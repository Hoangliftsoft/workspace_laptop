import java.text.DecimalFormat;
import java.util.Scanner;

public class demo7{
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.print("Nhap n: ");
        long n = scanner.nextLong();
        System.out.println("Can bac hai cua "+n+" la: "+ decimalFormat.format(1.0*Math.sqrt(n)) );

    }
}