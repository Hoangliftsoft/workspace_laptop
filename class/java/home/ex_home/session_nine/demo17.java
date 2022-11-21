import java.util.Scanner;

public class demo17 {

    // hàm tìm số lộc phát
    private static int is_so_loc_phat(int n) {
        int dem1 = 0, dem2 = 0;
        while (n != 0) {
            int tmp = n % 10;
            ++dem1;
            if (tmp == 0 || tmp == 6 || tmp == 8)
                ++dem2;
            n /= 10;
        }
        if (dem1 == dem2)
            return 1;
        else
            return 0;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap vao so nguyen: ");
            int n = scanner.nextInt();
            if (is_so_loc_phat(n) == 1) {
                System.out.println("--> " + n + " la so loc phat");
            } else {
                System.out.println("--> " + n + " khong phai la so loc phat");
            }
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
        scanner.close();
    }
}
