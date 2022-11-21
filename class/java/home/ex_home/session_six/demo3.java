import java.util.Scanner;

public class demo3 {
    // ham ve hinh binh hanh sao
    private static void hbhSao(int n) {
        for (int i = 1; i <= 5; ++i) {
            for (int j = n - i; j >= 1; --j) {
                System.out.print("~");
            }
            for (int j = 1; j <= n; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        hbhSao(n);
    }
}
