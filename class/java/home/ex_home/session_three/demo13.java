import java.util.Scanner;

public class demo13 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        int sum = 0;
        while(n!=0){
            int x = n%10;
            sum+=x;
            n/=10;
        }
        System.out.println("Sum = "+sum);
    }
}
