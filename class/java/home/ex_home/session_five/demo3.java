import java.util.Scanner;

public class demo3 {
    // ham tong chu so
    private static int sum(int n){
        int tam =0;
        while(n!=0){
            int cup = n%10;
            tam+= cup;
            n/=10;
        }
        return tam;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        System.out.println("Sum = "+sum(n));
    }
}
