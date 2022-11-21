import java.util.Scanner;

public class demo8 {
    private static void hcn(int n) {
        for (int i = 1; i <= n; ++i) {
            for (int j = i; j >= 1; --j) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= n - i + 1; ++j) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        hcn(n);
    }
}
