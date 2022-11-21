import java.util.Scanner;

public class demo16 {
    // check so nguyen to
    private static int snt(int n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i==0)  return 0;
        }
        return 1;
    }
    // in so nguyen to trong day
    private static void main_coppy(int n){
        for(int i=1;i<=n;++i){
            if(snt(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n= scanner.nextInt();
        main_coppy(n);
    }
}
