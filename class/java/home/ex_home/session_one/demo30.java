import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class demo30 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap c: ");
        int c = scanner.nextInt();
        int denta=b*b-4*a*c;
        if(a==0&&b==0&&c==0){
            System.out.println("INF");
        }else if(denta<0){
            System.out.println("OUT");
        }else if(denta>0){
            System.out.println(decimalFormat.format((-b+Math.sqrt(denta))/(2*a))+" "+decimalFormat.format((-b-Math.sqrt(denta))/(2*a)));
        }
    }
}
