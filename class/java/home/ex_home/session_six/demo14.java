import java.util.Scanner;

public class demo14 {
    // ham ve mui ten sang phai
    private static void muiTen(int n) {
        int count = 1, d = 0, check = 0;
        for (int i = 1; i >= 1; i += count) {
            for (int j = 1; j < n + i; ++j) {
                if (j < i + d) {
                    System.out.print("~");
                } else {
                    System.out.print("*");
                }
            }
            // d--;
            if (check == 0) {
                d++;
            } else {
                d--;
            }
            System.out.print("\n");
            if (i == n) {
                count = -1;
                check = 1;
                d = n - 2;
            }
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        muiTen(n);
    }
}
