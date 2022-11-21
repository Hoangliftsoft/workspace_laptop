import java.util.Scanner;

public class demo9 {
    private static int is_tong_chu_so(int digit) {
        int sum = 0;
        while (digit != 0) {
            int tmp = digit % 10;
            sum += tmp;
            digit /= 10;
        }
        return sum;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong test case: ");
        int amount = scanner.nextInt();
        while ((amount--) != 0) {
            System.out.print("Nhap so nguyen: ");
            int digit = scanner.nextInt();
            System.out.println("--> Tong cua chu so la: " + is_tong_chu_so(digit));
        }
        scanner.close();
    }
}
