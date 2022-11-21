import java.util.Scanner;

public class demo8 {
    // ham dem so
    private static int demSo(int n){
        int count=0;
        while(n!=0){
            ++count;
            n/=10;
        }
        return count;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n=scanner.nextInt();
        System.out.print("Count = "+demSo(n));
    }
}
