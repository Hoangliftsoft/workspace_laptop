import java.util.Scanner;

public class demo12 {
    private static void tgiac(int n) {
        int k = 2;
        for (int i = 1; i <= n; ++i) {
            int k2 = i * 2;
            for (int j = n - i; j >= 1; --j) {
                System.out.print("~ ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print(k + " ");
                k += 2;
            }
            for (int j = 1; j < i; ++j) {
                k2 -= 2;
                System.out.print(k2 + " ");
            }
            System.out.print("\n");
            k = 2;
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        tgiac(n);
    }
}
