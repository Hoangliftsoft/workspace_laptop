import java.util.Scanner;

public class demo25 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        try {
            System.out.print("Nhap vao so nguyen : ");
            int n = scanner.nextInt();
            so_nguyen_to_thu_k(n);
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
    }

    // hàm tìm số nguyên tố thứ k
    private static void so_nguyen_to_thu_k(int n) {
        System.out.print("Nhap k : ");
        int k = scanner.nextInt();
        int count = 0, count1 = 0;
        for (int i = 2; i <= n; ++i) {
            while (n % i == 0) {
                ++count;
                if (count == k) {
                    System.out.print("--> So nguyen to thu k la : " + i);
                    ++count1;
                }
                n /= i;
            }
        }
        if (count1 == 0) {
            System.out.print("-1");
        }
    }
}
