import java.util.Scanner;

public class demo8 {
    // ham ve tam giac vuong phai nguoc rong

    private static void tgv(int n) {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (j < i) {
                    System.out.print("~");
                } else if (j == i || j == n || i == 1) {
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
