import java.util.Scanner;

public class demo6 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i=1;i<=n;++i){
            sum += Math.pow(-1, i*i);
        }
        System.out.println("Sum = "+sum);
    }
}
