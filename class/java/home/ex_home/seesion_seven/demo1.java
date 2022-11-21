import java.util.Scanner;

public class demo1 {
    // ve hinh chu nhat so 1
    private static void hcn(int n) {
        int d1 = 0, d2 = 0;
        for (int i = 1; i <= n; ++i) {
            d1 = 0;
            d2 = 0;
            for (int j = 1; j <= n; ++j) {
                if (i % 2 == 0) {
                    if (d1 == 0) {
                        System.out.print("0");
                        d1 = 1;
                    } else {
                        System.out.print("1");
                        d1 = 0;
                    }
                } else {
                    if (d2 == 0) {
                        System.out.print("1");
                        d2 = 1;
                    } else {
                        System.out.print("0");
                        d2 = 0;
                    }
                }
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