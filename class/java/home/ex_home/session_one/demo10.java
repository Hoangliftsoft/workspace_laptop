import java.text.DecimalFormat;
import java.util.Scanner;

public class demo10 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        float sum = 0;

        for(int i=1;i<=n;++i){
            sum += 1/(1.0*i*(i+1));
        }
        System.out.println("sum = "+ decimalFormat.format(sum));
    }
}
