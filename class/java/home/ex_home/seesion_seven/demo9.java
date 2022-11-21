import java.util.Scanner;

public class demo9 {
    private static void hcn(int n) {
        for (int i = 1; i <= n; i++) {
            int count = i;
            for (int j = i; j < n; ++j) {
                System.out.print(count++);
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print(n);
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
