import java.util.Scanner;

public class demo14 {

    // hàm kiểm tra số nguyên tố
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

    // hàm kiểm tra số thuận nghịch
    private static int is_stn(int n) {
        int cpy = n, tam = 0;
        while (n != 0) {
            tam = tam * 10 + n % 10;
            n /= 10;
        }
        if (cpy == tam)
            return 1;
        else
            return 0;
    }

    // hàm kiểm tra có ba ước số nguyên tố
    private static int is_3_uoc_snt(int n) {
        int count = 0;
        for (int i = 1; i <= n; ++i) {
            if (n % i == 0) {
                if (is_snt(i) == 1)
                    ++count;
            }
        }
        if (count >= 3)
            return 1;
        else
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
                if (is_stn(i) == 1 && is_3_uoc_snt(i) == 1) {
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
