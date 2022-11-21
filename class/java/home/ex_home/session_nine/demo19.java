import java.util.Scanner;

public class demo19 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        try {
            System.out.print("Nhap so nguyen : ");
            int n = scanner.nextInt();
            int giai_thua = 1;
            for (int i = 1; i <= n; ++i) {
                giai_thua *= i;
            }
            System.out.print(n + "! = " + giai_thua);
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
    }
}
