import java.util.Scanner;

public class demo15 {
    private static void tgv(int n) {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j * 2 + " ");
            }
            for (int j = i; j > 1; --j) {
                System.out.print(j * 2 - 2 + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        tgv(n);
    }
}
