import java.util.Scanner;

public class demo5 {
    // ham ve hinh chu nhat so 5
    private static void hcn(int n) {
        int x;
        for (int i = 1; i <= n; ++i) {
            x = i;
            for (int j = 1; j <= i; ++j) {
                if (j == 1) {
                    System.out.print(i + " ");
                } else {
                    x += n - j + 1;
                    System.out.print(x + " ");
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
