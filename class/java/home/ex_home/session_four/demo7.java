import java.util.Scanner;

public class demo7 {
    // ham thuan nghich
    private static int stn(int n){
        int x = 0,m=n;
        while(n!=0){
            x=x*10+n%10;
            n/=10;
        }
        if(m==x)    return 1;
        else return 0;
    }
    // ham so nguyen to
    private static int snt(int n){
        if(n<2)    return 0;
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i==0)  return 0;
        }   return 1;
    }
    // ham ktra 3 uoc
    private static int ktra3Uoc(int n){
        int count =0;
        for(int i=1;i<=n;++i){
            if(n%i==0){
                if(snt(i)==1){
                    ++count;
                }
            }
        }
        if(count >=3)   return 1;
        return 0;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap i: ");
        int i=scanner.nextInt();
        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        System.out.print("Cac so dep la: ");
        for(;i<=n;++i){
            if(stn(i)==1&&ktra3Uoc(i)==1){
                System.out.print(i+" ");
            }
        }

    }
}
