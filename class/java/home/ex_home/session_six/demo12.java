import java.util.Scanner;

public class demo12 {
    // ham ve tam giac vuong trai rong
    private static void tgv(int n) {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
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
