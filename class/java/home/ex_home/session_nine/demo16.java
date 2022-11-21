import java.util.Scanner;

public class demo16 {

    // hàm tìm giai thừa
    private static int is_giai_thua(int n) {
        int mul = 1;
        for (int i = 1; i <= n; ++i) {
            mul *= i;
        }
        return mul;
    }

    // hàm tìm số strong
    private static int is_strong(int n) {
        int sum = 0, cpy = n;
        while (n != 0) {
            int tmp = n % 10;
            sum += is_giai_thua(tmp);
            n /= 10;
        }
        if (cpy == sum)
            return 1;
        else
            return 0;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap so thu nhat: ");
            int i = scanner.nextInt();
            System.out.print("Nhap so thu hai: ");
            int n = scanner.nextInt();
            System.out.print("So Strong trong day la: ");
            for (; i <= n; ++i) {
                if (is_strong(i) == 1) {
                    System.out.print(i + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
        scanner.close();
    }
}
