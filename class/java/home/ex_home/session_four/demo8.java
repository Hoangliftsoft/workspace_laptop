import java.util.Scanner;

public class demo8 {
    private static int stn(int n){
        int tam=0,coppy=n;
        while(n!=0){
            tam=tam*10+n%10;
            n/=10;
        }
        if(tam == coppy)    return 1;
        return 0;
    }
    private static int chiaHet10(int n){
        int tam = 0;
        while(n!=0){
            int x=n%10;
            tam+=x;
            n/=10;
        }
        if(tam%10==0)   return 1;
        return 0;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n= scanner.nextInt();
        int count=0;
        int i=(int)Math.pow(10, n-1);
        for(;i<Math.pow(10, n);++i){
            if(stn(i)==1&&chiaHet10(i)==1){
                ++count;
            }
        }
        System.out.print(count);
    }
}
