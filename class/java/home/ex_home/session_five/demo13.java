import java.util.Scanner;

public class demo13 {
    // ham ktra stn
    private static int stn(int n) {
        int tam = 0, coppy = n;
        while (n != 0) {
            tam = tam * 10 + n % 10;
            n /= 10;
        }
        if (tam == coppy)
            return 1;
        return 0;
    }

    // ham ktra khong chua 9
    private static int ktra9(int n) {
        while (n != 0) {
            int cup = n % 10;
            if (cup == 9)
                return 0;
            n /= 10;
        }
        return 1;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 2; i < n; ++i) {
            if (stn(i) == 1 && ktra9(i) == 1) {
                ++count;
            }
        }
        System.out.print("Co " + count + " so");
    }
}
