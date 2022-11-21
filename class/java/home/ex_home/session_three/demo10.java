import java.util.Scanner;

public class demo10 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n= scanner.nextInt();
        int giaiThua = 1;
        for(int i=1;i<=n;++i){
            giaiThua*= i;
        }
        System.out.println("Giai Thua: "+giaiThua);
    }
}
