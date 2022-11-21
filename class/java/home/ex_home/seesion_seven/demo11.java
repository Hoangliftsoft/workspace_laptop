import java.util.Scanner;

public class demo11 {
    private static void tgiac(int n) {
        int x;
        for (int i = 1; i <= n; ++i) {
            x = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x += n - j;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        tgiac(n);
    }
}
