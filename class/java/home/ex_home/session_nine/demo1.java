import java.util.Scanner;

public class demo1 {
    // ham check so thuan nghich
    private static int stn(int n) {
        int coppy = n, cup = 0;
        while (coppy != 0) {
            cup = cup * 10 + coppy % 10;
            coppy /= 10;
        }
        if (cup == n)
            return 1;
        return 0;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input test case amount: ");
        int t = scanner.nextInt();
        while ((t--) != 0) {
            System.out.print("Input Number: ");
            int n = scanner.nextInt();
            if (stn(n) == 1) {
                System.out.print(n + " la so thuan nghich\n");
            } else {
                System.out.print(n + " khong phai la so thuan nghich\n");
            }
        }
        scanner.close();
    }
}