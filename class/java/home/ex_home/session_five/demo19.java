import java.util.Scanner;

public class demo19 {
    // ham check snt
    private static int snt(int n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i==0)  return 0;
        }
        return 1;
    }
    // ham dao nguoc(reverse)
    private static int reverse(int n){
        int rev =0 ;
        while(n!=0){
            rev = rev *10+n%10;
            n/=10;
        }
        return rev;
    }
    // ham output
    private static void main_coppy(int fir,int sec){
        for(int i=fir;i<=sec;++i){
            if(i>11){
                if(snt(i)==1&&snt(reverse(i))==1){
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input FirstNumber: ");
        int fir=scanner.nextInt();
        System.out.print("Input SecondNumber: ");
        int sec=scanner.nextInt();
        main_coppy(fir, sec);
    }
}
