import java.util.Scanner;

public class demo2 {
    // ham tim so dau tien va so cuoi cung
    private static void dauCuoi(int n) {
        int after = n % 10, tam = 0;
        while (n != 0) {
            tam = tam * 10 + n % 10;
            n /= 10;
        }
        int before = tam % 10;
        System.out.print("Before: " + before + "\nAfter: " + after);
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        dauCuoi(n);
    }
}
