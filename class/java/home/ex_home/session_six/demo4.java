import java.util.Scanner;

public class demo4 {
    // ham ve tam giac vuong nguoc rong
    private static void tgvNguocRong(int n) {
        for (int i = 1; i <= n; ++i) {
            for (int j = n - i; j >= 0; --j) {
                if (i == 1 || j == 0 || j == n - i) {
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
        tgvNguocRong(n);
    }
}