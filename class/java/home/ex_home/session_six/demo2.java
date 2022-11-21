import java.util.Scanner;

public class demo2 {
    // ham ve hinh chu nhat
    private static void hcn(int row, int col) {
        for (int i = 1; i <= row; ++i) {
            for (int j = 1; j <= col; ++j) {
                System.out.print("1");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input row: ");
        int row = scanner.nextInt();
        System.out.print("Input col: ");
        int col = scanner.nextInt();
        hcn(row, col);
    }
}
