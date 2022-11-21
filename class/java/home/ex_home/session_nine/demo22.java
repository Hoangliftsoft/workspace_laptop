import java.util.Scanner;

public class demo22 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        try {
            System.out.print("Nhap vao so nguyen : ");
            int n = scanner.nextInt();
            int count = 0;
            System.out.print("--> So cuoi cung lon nhat : ");
            for (int i = 1; i < n; ++i) {
                if (is_snt(i) == 1 && is_so_cuoi_cung_lon_nhat(i) == 1) {
                    System.out.print(i + " ");
                    ++count;
                }
            }
            System.out.print("\n--> Co " + count + " so");
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
    }

    // hàm kiểm tra số nguyên tố
    private static int is_snt(int n) {
        if (n < 2)
            return 0;
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    // hàm kiểm tra chữ số cuối cùng lớn nhất
    private static int is_so_cuoi_cung_lon_nhat(int n) {
        int n_after = n % 10;
        n /= 10;
        while (n != 0) {
            int tmp = n % 10;
            if (n_after < tmp)
                return 0;
            n /= 10;
        }
        return 1;
    }
}
