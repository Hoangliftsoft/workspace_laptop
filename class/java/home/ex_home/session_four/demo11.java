import java.util.Scanner;
public class demo11 {

    public static int giaiThua(int n){
        int mul=1;
        for(int i=1;i<=n;++i){
            mul*=i;
        }
        return mul;
    } 

    private static int tongGiaiThua(int n){
        int sum = 0,coppy = n;
        while(n!=0){
            int tach = n%10;
            sum+= giaiThua(tach);
            n/=10;
        }
        if(sum == coppy)    return 1;
        return 0;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input FirstNumber: ");
        int i=scanner.nextInt();
        System.out.println("Input SecondNumber: ");
        int n= scanner.nextInt();
        System.out.print("So Strong la: ");
        for(;i<=n;++i){
            if(tongGiaiThua(i)==1)
                System.out.print(i+" ");
        }
    }
}
