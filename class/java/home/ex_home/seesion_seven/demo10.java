import java.util.Scanner;

public class demo10 {
    private static void tgiac(int n) {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
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
