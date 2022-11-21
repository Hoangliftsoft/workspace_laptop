import java.util.Scanner;

public class demo12 {
    public static int soLocPhat(int n){
        while(n!=0){
            int x = n%10;
            if((x != 0)&&(x != 6)&&(x != 8))
                return 0;
            n/=10;
        }
        return 1;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        if(soLocPhat(n)==1){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
}
