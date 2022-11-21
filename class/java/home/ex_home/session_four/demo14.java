import java.util.Scanner;

public class demo14 {
    // ham multiplication
    private static int multiplication(int n){
        int mul=1;
        while(n!=0){
            int cup = n%10;
            mul *= cup;
            n/=10;
        }
        return mul;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        System.out.println("Multiplication = "+multiplication(n));
    }
}
