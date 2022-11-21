import java.util.Scanner;

public class demo13 {
    // ham ktra tong cac so co so cuoi cung la 8
    private static int ktraSo8(int n){
        int sum =0;
        while(n!=0){
            int tam = n%10;
            sum+= tam;
            n/=10;
        }
        int check8 = sum %10;
        if(check8 == 8) return 1;
        return 0;
    }

    // ham ktra co it nhat 1 so 6
    private static int ktraSo6(int n){
        int count = 0;
        while(n!=0){
            int tam = n%10;
            if(tam == 6)
                ++count;
            n/=10;
        }
        if(count >= 1)  return 1;
        return 0;
    }
    // ham thuan nghich
    private static int stn(int n){
        int tam = 0,coppy=n;
        while(n!=0){
            tam = tam*10+n%10;
            n/=10; 
        }
        if(tam == coppy)    return 1;
        return 0;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input FirstNumber: ");
        int i = scanner.nextInt();
        System.out.println("Input SecondNumber: ");
        int n = scanner.nextInt();
        System.out.print("So Dep Trong Day La: ");
        for(;i<=n;++i){
            if(stn(i)==1&&ktraSo6(i)==1&&ktraSo8(i)==1){
                System.out.print(i+" ");
            }
        }

    }
}
