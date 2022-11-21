import java.util.Scanner;

public class demo11 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        long n = scanner.nextLong();
        long sum = 0;

        for(int i=1;i<=n;++i){
            sum += 2*i;
        }
        System.out.println("sum = "+sum);
    }
}
