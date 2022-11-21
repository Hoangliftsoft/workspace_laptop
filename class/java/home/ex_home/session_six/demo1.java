import java.util.Scanner;

public class demo1 {
    // ham ve hinh binh hanh nguoc sao
    private static void hbh(int row, int col) {
        for (int i = 1; i <= row; ++i) {
            for (int j = 2; j <= i; ++j) {
                System.out.print("~");
            }
            for (int j = 1; j <= col; ++j) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
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
        hbh(row, col);

    }
}