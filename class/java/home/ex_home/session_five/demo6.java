import java.util.Scanner;

public class demo6{

    // ham tim so hoan hao
    private static int shh(int n){
        int sum = 0;
        for(int i=1;i<n;++i){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum == n)    return 1;
        return 0;
    }
    // ham output
    private static void main_coppy(int n){
        System.out.print("Cac so hoan hao trong day la: ");
        for(int i=1;i<n;++i){
            if(shh(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        main_coppy(n);
    }
}