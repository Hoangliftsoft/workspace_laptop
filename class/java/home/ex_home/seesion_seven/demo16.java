import java.util.Scanner;

public class demo16 {
    private static void tgiac(int n) {
        for (int i = 1; i <= n; ++i) {
            int d1 = 1;
            for (int j = n - i; j >= 1; --j) {
                System.out.print("~");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print(d1);
                d1 += 2;
            }
            int d2 = d1 - 4;
            for (int j = 1; j < i; ++j) {
                System.out.print(d2);
                d2 -= 2;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        tgiac(n);
    }
}
