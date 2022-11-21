import java.util.Scanner;

public class demo1{
    // ham giai thua
    private static int giaithua(int n){
        int mul = 1;
        for(int i=1;i<=n;++i){
            mul*=i;
        }   return mul;
    }
    // ham tim so strong
    private static int strong(int n){
        int str=0,coppy = n;
        while(n!=0){
            int cup = n%10;
            str+= giaithua(cup);
            n/=10;
        }
        if(str == coppy)    return 1;
        return 0;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        if(strong(n)==1){
            System.out.println(n+" la so strong");
        }else{
            System.out.println(n+" khong phai la so strong");
        }

    }
}