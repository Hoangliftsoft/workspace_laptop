import java.util.Scanner;

public class demo7 {
    private static void hcn(int n) {
        int count_two = n;
        for (int i = 1; i <= n; ++i) {
            int count_one = n;
            for (int j = 1; j <= i; ++j) {
                System.out.print(count_one-- + " ");
            }
            for (int j = n - i; j >= 1; --j) {
                System.out.print(count_two + " ");
            }
            System.out.print("\n");
            count_two--;
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        hcn(n);
    }
}
