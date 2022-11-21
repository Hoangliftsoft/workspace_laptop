import java.util.Scanner;

public class demo11 {
    // ham ktra Fibonacci
    private static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return 1;
        int fn1 = 0, fn2 = 1;
        for (int i = 3; i <= n; ++i) {
            int fn = fn1 + fn2;
            if (n == fn)
                return 1;
            fn1 = fn2;
            fn2 = fn;
        }
        return 0;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        if (fibonacci(n) == 1) {
            System.out.print(n + " la so fibonacci");
        } else {
            System.out.print(n + " khong phai la so fibonacci");
        }
    }
}
