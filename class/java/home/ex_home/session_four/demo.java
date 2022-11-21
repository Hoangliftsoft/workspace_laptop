import java.util.Scanner;

public class demo {
    
    private static int tangDan(int n) {
        int tam = n % 10;
        n /= 10;
        while (n > 0) {
            if (tam <= n % 10) {
                return 0;
            }
            tam = n % 10;
            n /= 10;
        }
        return 1;
    }
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
            if ((tangDan(n) == 1 )) {
                System.out.print(n + " yes");

        }
    }
}
// || giamDan(n) == 1