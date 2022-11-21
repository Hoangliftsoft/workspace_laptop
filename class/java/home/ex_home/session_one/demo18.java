import java.util.Scanner;

public class demo18 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao thang: ");
        int t = scanner.nextInt();
        System.out.print("Nhap vao nam: ");
        int n = scanner.nextInt();

        if ((t <= 0 || t > 12) || (n <= 0)) {
            System.out.println("INVALID");
        } else if ((t == 1) || (t == 3) || (t == 5) || (t == 7) || (t == 8) || (t == 10) || (t == 12)) {
            System.out.println("Thang " + t + " co 31 ngay");
        } else if ((t == 4) || (t == 6) || (t == 9) || (t == 11)) {
            System.out.println("Thang " + t + " co 30 ngay");
        } else if (t == 2) {
            if (n % 4 == 0) {
                System.out.println("Thang " + t + " co 29 ngay");
            } else {
                System.out.println("Thang " + t + " co 28 ngay");
            }
        }
    }
}
