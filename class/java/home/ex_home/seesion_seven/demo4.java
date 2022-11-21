import java.util.Scanner;

public class demo4 {
    // ham ve hinh chu nhat so 4
    private static void hcn(int n) {
        int count = 1;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (j <= n - i) {
                    System.out.print("~");
                } else {
                    System.out.print(count);
                }
            }
            System.out.print("\n");
            count++;
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        hcn(n);
    }
}
