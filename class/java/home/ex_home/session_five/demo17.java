import java.util.Scanner;

public class demo17 {

    // ham output
    private static void phanTichSnt(int n){
        for(int i=2;i<=n;++i){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n=scanner.nextInt();
        phanTichSnt(n);
    }
}
