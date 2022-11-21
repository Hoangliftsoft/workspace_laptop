import java.util.Scanner;

public class demo4 {
    public static Scanner gscanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        try {
            System.out.print("Nhap vao so nguyen : ");
            int n = gscanner.nextInt();
            System.out.print("Count : " + count_number(n));
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
    }

    // hàm đếm số lượng chữ số bằng đệ quy
    private static int count_number(int n) {
        if (n < 10)
            return 1;
        else
            return 1 + count_number(n / 10);
    }
}
