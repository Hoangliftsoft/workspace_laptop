import java.util.Scanner;

public class demo9 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        long n = scanner.nextLong();
        long sum = 0;

        for(int i=0;i<=n;++i){
            sum+= Math.pow(i,2);
        }
        System.out.println("sum = " + sum);
    }
}
