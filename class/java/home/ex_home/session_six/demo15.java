import java.util.Scanner;

public class demo15 {
    // ham ve hinh bang so
    private static void hinhSo(int n) {
        int count_one, count_two = n;
        for (int i = 1; i <= n; ++i) {
            count_one = n;
            for (int j = 1; j <= i; ++j) {
                System.out.print(count_one--);
            }
            for (int j = n - i; j >= 1; --j) {
                System.out.print(count_two);
            }
            count_two--;
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
