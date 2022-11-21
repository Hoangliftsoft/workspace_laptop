import java.util.Scanner;

public class demo9 {
    // ham ve hinh bang so
    private static void hinhSo(int n) {
        int count = 1;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                System.out.print(count++ + " ");
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
