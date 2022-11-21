import java.util.Scanner;

public class demo5 {
    // ham tinh giai thua
    private static int giaiThua(int n){
        int mul=1;
        for(int i=1;i<=n;++i){
            mul*=i;
        }
        return mul;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        System.out.print(n+"! = "+giaiThua(n));
    }
}
