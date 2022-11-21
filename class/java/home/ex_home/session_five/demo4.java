import java.util.Scanner;

public class demo4 {
    private static int snt(int n) {
        if (n < 2)
            return 1;
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        if (snt(n) == 1)
            System.out.print(n + " la so nguyen to");
        else
            System.out.print(n + " khong phai la so nguyen to");
    }
}
