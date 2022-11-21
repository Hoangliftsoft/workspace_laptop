import java.util.Scanner;

public class demo9 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        int sum= 0;
        for(int i=1;i<=n;++i){
            sum += Math.pow(i, 3);
        }
        System.out.println("Sum = "+sum);
    }
}
