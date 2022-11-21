import java.util.Scanner;

public class demo20 {
    // ham phan tich thua so nguyen to
    private static void ptichSnt(int n){
        int tam = 0;
        System.out.print("Cac so nguyen to la: ");
        for(int i=2;i<=n;++i){
            while(n%i==0){
                if(n%i==0){
                    if(i!=tam){
                        System.out.print(i+" ");
                        n/=i;
                        tam = i;
                    }
                }
            }
        }
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        ptichSnt(n);
    }
}
