import java.util.Scanner;

public class demo9 {
    // ham armstrong
    private static int armstrong(int n){
        int sum = 0, count=0;
        int counts=n, coppy = n;
        while(counts!=0){
            ++count;
            counts/=10;
        }
        while(n!=0){
            int cup=n%10;
            sum+= Math.pow(cup, count);
            n/=10;
        }
        if(sum == coppy)    return 1;
        return 0;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n=scanner.nextInt();
        if(armstrong(n)==1){
            System.out.print(n+" la so armstrong");
        }else{
            System.out.print(n+" khong phai la so armstrong");
        }
    }
}
