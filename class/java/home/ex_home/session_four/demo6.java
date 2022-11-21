import java.util.Scanner;

public class demo6 {
    private static void phtichSNT(int n){
        for(int i=2;i<=n;++i){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        phtichSNT(n);
    }
}
