import java.util.Scanner;

public class demo21 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        try {
            System.out.print("Nhap so nguyen : ");
            int n = scanner.nextInt();
            int count = 0;
            System.out.print("--> So thuan nghich khong chua 9 : ");
            for (int i = 2; i < n; ++i) {
                if (is_so_thuan_nghich(i) == 1 && is_khong_chua_9(i) == 1) {
                    System.out.print(i + " ");
                    ++count;
                }
            }
            System.out.print("\n--> Co " + count + " so");
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
    }

    // hàm kiểm tra số thuân nghịch
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

    // hàm kiểm tra không chứa số 9
    private static int is_khong_chua_9(int n) {
        int count = 0;
        while (n != 0) {
            int tmp = n % 10;
            if (tmp == 9)
                ++count;
            n /= 10;
        }
        if (count == 0)
            return 1;
        else
            return 0;
    }
}
