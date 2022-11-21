import java.util.Scanner;

public class demo23 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        try {
            System.out.print("Nhap vao so thu nhat : ");
            int first_number = scanner.nextInt();
            System.out.print("Nhap vao so thu hai : ");
            int second_number = scanner.nextInt();
            if (is_snt_cung_nhau(first_number, second_number) == 1) {
                System.out.print("--> " + first_number + " " + second_number + " la so nguyen to cung nhau");
            } else {
                System.out.print("--> " + first_number + " " + second_number + " khong phai la so nguyen to cung nhau");
            }
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
    }

    // hàm kiểm tra số nguyên tố cùng nhau
    private static int is_snt_cung_nhau(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        if (a == 1)
            return 1;
        else
            return 0;
    }
}
