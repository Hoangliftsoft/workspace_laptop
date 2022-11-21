import java.text.DecimalFormat;
import java.util.Scanner;

public class demo4 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.000");

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        float sum=0;
        for(int i=1;i<=n;++i){
            sum+=(1.0*1/i);
        }
        System.out.println("Sum = "+decimalFormat.format(sum));
    }
}
