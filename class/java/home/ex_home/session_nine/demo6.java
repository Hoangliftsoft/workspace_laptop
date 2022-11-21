import java.util.Scanner;

public class demo6 {
    private static int is_uoc(int digit) {
        int count = 0;
        for (int i = 1; i <= digit; ++i) {
            if (digit % i == 0)
                ++count;
        }
        return count;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong test case: ");
        int amount = scanner.nextInt();
        while ((amount--) != 0) {
            System.out.print("Nhap so nguyen: ");
            int digit = scanner.nextInt();
            System.out.print("Co " + is_uoc(digit) + " uoc");
            System.out.print("\n");
        }
        scanner.close();
    }
}
