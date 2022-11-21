import java.util.Scanner;

public class demo4 {

    // so nguyen to
    private static int snt(int n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i==0) return 0;
        }   return 1;
    }
    // tinh tong
    private static int tong(int n){
        int sum = 0;
        while(n!=0){
            int x=n%10;
            sum+=x;
            n/=10;
        }   return sum;
    }
    // fibonaci
    private static int fibo(int n){
        if(n==0||n==1)  return 1;
        int fn1=0,fn2=1;
        for(int i=3;i<=93;++i){
            int fn = fn1+fn2;
            if(fn==n) return 1;
            fn1=fn2;
            fn2=fn;
        }   return 0;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap i: ");
        int i= scanner.nextInt();
        System.out.println("Nhap n: ");
        int n= scanner.nextInt();
        for(;i<=n;++i){
            if((snt(i)==1)&&(fibo(tong(i))==1)){
                System.out.print(i+" ");
            }
        }
    }
}
