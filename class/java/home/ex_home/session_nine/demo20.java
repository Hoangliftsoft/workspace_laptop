import java.util.Scanner;

public class demo20 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        try {
            System.out.print("Nhap so nguyen : ");
            int n = scanner.nextInt();
            check_armstrong(n);
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
    }

    // hàm điếm chữ số
    private static int is_dem_chu_so(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n /= 10;
        }
        return count;
    }

    // hàm kiểm tra so armstrong
    private static void check_armstrong(int n) {
        int mu = is_dem_chu_so(n);
        int sum = 0, cpy_n = n;
        while (n != 0) {
            int tmp = n % 10;
            sum += Math.pow(tmp, mu);
            n /= 10;
        }
        if (cpy_n == sum) {
            System.out.print(cpy_n + " la so armstrong");
        } else {
            System.out.print(cpy_n + " khong phai la so armstrong");
        }
    }
}
