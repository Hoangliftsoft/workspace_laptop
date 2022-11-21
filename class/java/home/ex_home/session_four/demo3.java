import java.util.Scanner;

public class demo3 {
    // check snt
    private static int snt(int n) {
        if (n < 2)
            return 0;
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    // tang dan
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

    // giam dan
    private static int giamDan(int n) {
        int tam = n % 10;
        n /= 10;
        while (n > 0) {
            if (tam >= n % 10) {
                return 0;
            }
            tam = n % 10;
            n /= 10;
        }
        return 1;
    }

    private static void main_center(int n) {
        int count = 0;
        int i = (int) Math.pow(10, n - 1);
        for (; i < Math.pow(10, n); ++i) {
            if (snt(i) == 1 && (tangDan(i) == 1 || giamDan(i) == 1)) {
                ++count;
            }
        }
        System.out.println("Count = "+count);
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        main_center(n);
    }
}
