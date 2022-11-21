import java.util.Scanner;

public class demo18 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();

        if(n%2==0){
            System.out.println(n/2);
            for(int i=1;i<=n/2;++i){
                System.out.print("2 ");
            }
        }else if(n%2!=0){
            System.out.println(n/2);
            for(int i=1;i<=n/2-1;++i){
                System.out.print("2 ");
            }
            System.out.print("3");
        }
    }
}
