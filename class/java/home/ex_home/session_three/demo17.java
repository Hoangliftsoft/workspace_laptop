import java.util.Scanner;

public class demo17 {
    private static int soDep(int n){
        int chan=0,le=0;
        while(n!=0){
            int x=n%10;
            if(x%2==0){
                ++chan;
            }else if(x%2!=0){
                ++le;
            }
            n/=10;
        }
        if(chan == le)  return 1;
        else   return 0;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();

        if(soDep(n)==1) System.out.println("YES");
        else System.out.println("NO");
    }
}
