import java.util.Scanner;

public class demo2 {
    // ve hinh chu nhat so 2
    private static void hcn(int n) {
        int count_one = 1, count_two;
        for (int i = 1; i <= n; ++i) {
            count_two = count_one++;
            for (int j = 1; j <= n; ++j) {
                System.out.print(count_two++);
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
