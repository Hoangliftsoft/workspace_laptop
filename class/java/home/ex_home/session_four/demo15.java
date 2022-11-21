import java.util.Scanner;

public class demo15 {
    private static void lietKeUoc(int n){
        System.out.print("Cac uoc cua "+n+" la: ");
        for(int i=1;i<=n;++i){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        lietKeUoc(n);
    }
}
