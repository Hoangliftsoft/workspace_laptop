import java.util.Scanner;

public class demo2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        try {
            System.out.print("Nhap vao so nguyen : ");
            int n = scanner.nextInt();
            System.out.print("Sum : " + sum(n));
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh");
        }
    }

    // hàm tính tổng bằng đệ quy
    private static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return ((int) Math.pow(n, 2) + sum(n - 1));
    }
}
