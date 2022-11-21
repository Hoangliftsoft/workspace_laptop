import java.util.Scanner;

public class demo18 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        try {
            System.out.print("Nhap so thu nhat: ");
            int i = scanner.nextInt();
            System.out.print("Nhap so thu hai: ");
            int n = scanner.nextInt();
            System.out.print("--> So thuan nghich va loc phat : ");
            for (; i <= n; ++i) {
                if (is_so_thuan_nghich(i) == 1 && is_co_so_6(i) == 1 && is_tan_cung_8(i) == 1) {
                    System.out.print(i + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
    }

    // hàm tìm số thuận nghịch
    private static int is_so_thuan_nghich(int n) {
        int cpy = n, tmp = 0;
        while (n != 0) {
            tmp = tmp * 10 + n % 10;
            n /= 10;
        }
        if (cpy == tmp)
            return 1;
        else
            return 0;
    }

    // hàm kiểm tra có ít nhất 1 chữ số 6
    private static int is_co_so_6(int n) {
        int count = 0;
        while (n != 0) {
            int tmp = n % 10;
            if (tmp == 6)
                ++count;
            n /= 10;
        }
        if (count > 0)
            return 1;
        else
            return 0;
    }

    // hàm kiểm tra tổng chữ số có chữ số cuối cùng là 8
    private static int is_tan_cung_8(int n) {
        int sum = 0;
        while (n != 0) {
            int tmp = n % 10;
            sum += tmp;
            n /= 10;
        }
        int sum_after = sum % 10;
        if (sum_after == 8)
            return 1;
        else
            return 0;
    }
}
