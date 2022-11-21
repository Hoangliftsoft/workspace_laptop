import java.util.Scanner;

public class demo11 {
    // ham ve hinh bang so
    private static void hinhSo(int n) {
        int tam = 0, count_left, count_right;
        for (int i = 1; i <= n; ++i) {
            count_left = ++tam;
            for (int j = 1; j <= i; ++j) {
                System.out.print(count_left-- + " ");
            }
            count_right = 2;
            for (int j = n - i; j >= 1; --j) {
                System.out.print(count_right++ + " ");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        hinhSo(n);
    }
}
