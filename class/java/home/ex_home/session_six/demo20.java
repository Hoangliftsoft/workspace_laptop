import java.util.Scanner;

public class demo20 {
    // ham ve hinh chua hinh thoi
    private static void hthoi(int n) {
        int d1 = 1;
        for (int i = 1; i >= 1; i += d1) {
            for (int j = 1; j <= n * 2; ++j) {
                if (j <= n + 1 - i || j >= n + i) {
                    System.out.print("*");
                } else {
                    System.out.print("~");
                }
            }
            System.out.print("\n");
            if (i == n)
                d1 = -1;
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        hthoi(n);
    }
}
