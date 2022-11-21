import java.util.Scanner;

public class demo12 {
    // ham ktra so nguyen to
    private static int snt(int n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i==0)  return 0;
        }
        return 1;
    }
    // ham ktra tong chu so chia het cho 5
    private static int chiaHet5(int n){
        int sum=0;
        while(n!=0){
            int x=n%10;
            sum+=x;
            n/=10;
        }
        if(sum %5==0)   return 1;
        return 0;
    }
    // ham output
    private static void main_coppy(int n){
        int count=0;
        for(int i=1;i<n;++i){
            if(snt(i)==1&&chiaHet5(i)==1){
                ++count;
            }
        }
        System.out.print("Co "+count+" so");
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        main_coppy(n);
    }
}
