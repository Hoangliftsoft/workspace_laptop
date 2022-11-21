import java.util.Scanner;

public class demo13 {

    // hàm kiểm tra so nguyen to
    private static int is_snt(int n) {
        if (n < 2)
            return 0;
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    // hàm tổng chữ số
    private static int is_tong_chu_so(int n) {
        int sum = 0;
        while (n != 0) {
            int tmp = n % 10;
            sum += tmp;
            n /= 10;
        }
        return sum;
    }

    // hàm kiểm tra so fibonacci
    private static int is_fibonacci(int n) {
        int fn, fn1 = 0, fn2 = 1;
        if (n == 0 || n == 1)
            return 1;
        for (int i = 3; i <= 93; ++i) {
            fn = fn1 + fn2;
            if (n == fn) {
                return 1;
            }
            fn1 = fn2;
            fn2 = fn;
        }
        return 0;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        try {
            int count = 0;
            System.out.print("Nhap so thu nhat: ");
            int i = scanner.nextInt();
            System.out.print("Nhap so thu hai: ");
            int n = scanner.nextInt();
            System.out.print("So dep trong day la: ");
            for (; i <= n; ++i) {
                if (is_snt(i) == 1 && is_fibonacci(is_tong_chu_so(i)) == 1) {
                    System.out.print(i + " ");
                    ++count;
                }
            }
            if (count == 0) {
                System.out.print("-1");
            }
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
        scanner.close();
    }
}
