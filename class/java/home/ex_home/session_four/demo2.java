import java.util.Scanner;

public class demo2{
    private static int checkShh(int n){
        int sum=0;
        for(int i=1;i<n;++i){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum == n)    return 1;
        else return 0;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap i: ");
        int i=scanner.nextInt();
        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        for(;i<=n;++i){
            if(checkShh(i)==1){
                System.out.print(i +" ");
            }
        }

    }
}