import java.util.Scanner;

public class demo26 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        try {
            System.out.print("Nhap vao so nguyen : ");
            long n = scanner.nextLong();
            dem_so_lan_xuat_hien(n);
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
    }

    // hàm đếm số lần xuất hiện của snt
    private static void dem_so_lan_xuat_hien(long n) {
        int c2 = 0, c3 = 0, c5 = 0, c7 = 0;
        while (n != 0) {
            Long tmp = n % 10;
            if (tmp == 2)
                ++c2;
            if (tmp == 3)
                ++c3;
            if (tmp == 5)
                ++c5;
            if (tmp == 7)
                ++c7;
            n /= 10;
        }
        if (c2 > 0)
            System.out.print("--> 2 xuat hien " + c2 + " lan");
        if (c3 > 0)
            System.out.print("\n--> 3 xuat hien " + c3 + " lan");
        if (c5 > 0)
            System.out.print("\n--> 5 xuat hien " + c5 + " lan");
        if (c7 > 0)
            System.out.print("\n--> 7 xuat hien " + c7 + " lan");
    }
}
