import java.util.Scanner;

public class demo6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        try {
            System.out.print("Nhap vao so nguyen : ");
            int n = scanner.nextInt();
            System.out.print("--> Reverse = ");
            sum(n);
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
    }

    // hàm tính tổng bằng đệ quy
    private static void sum(int n) {
        if (n != 0) {
            System.out.print(n % 10);
            sum(n / 10);
        }
    }
}