import java.util.Scanner;

public class demo2 {
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
            System.out.print("Input Number: ");
            long n = scanner.nextInt();
            if (scp(n) == 1) {
                System.out.print(n + " la so chinh phuong\n");
            } else {
                System.out.print(n + " khong phai la so chinh phuong\n");
            }
        }
        scanner.close();
    }
}
