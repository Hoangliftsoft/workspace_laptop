import java.util.Scanner;

public class demo11 {
    private static void fibonacci(int n){
        int fn,fn1=0,fn2=1;
        System.out.print("0 1 ");
        for(int i=3;i<=n;++i){
            fn=fn1+fn2;
            System.out.print(fn+" ");
            fn1=fn2;
            fn2=fn;
        }
    }
    public static void main(String[] agrs){
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.print("Nhap so nguyen: ");
            int digit=scanner.nextInt();
            fibonacci(digit);
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh: "+e);
        }
        scanner.close();
    }
}
