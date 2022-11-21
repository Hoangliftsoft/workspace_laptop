import java.util.Scanner;

public class demo5 {
    private static void main_center(int n){
        System.out.print("0 1 ");
        int fn1=0,fn2=1;
        for(int i=3;i<=n;++i){
            int fn = fn1+ fn2;
            System.out.print(fn+" ");
            fn1=fn2;
            fn2=fn;
        }
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        main_center(n);
    }
}
