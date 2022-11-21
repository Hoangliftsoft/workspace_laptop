import java.util.Scanner;

public class demo3 {
    // ham check so chinh phuong
    private static long scp(long n) {
        long sqrt_n = (long) Math.sqrt(n);
        if (n == (long) Math.pow(sqrt_n, 2)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input test case amount: ");
        int t = scanner.nextInt();
        while ((t--) != 0) {
            System.out.print("Input FirstNumber: ");
            long i = scanner.nextInt();
            System.out.print("Input SecondNumber: ");
            long n = scanner.nextInt();
            System.out.print("So chinh phuong trong day: ");
            for (; i <= n; ++i) {
                if (scp(i) == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
