import java.util.Scanner;

public class demo7 {
    private static int is_uoc(int digit) {
        int count = 0;
        for (int i = 1; i <= digit; ++i) {
            if (digit % i == 0)
                ++count;
        }
        if (count % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong test case: ");
        int amount = scanner.nextInt();
        while ((amount--) != 0) {
            System.out.print("Nhap so nguyen: ");
            int digit = scanner.nextInt();

            if (is_uoc(digit) == 0) {
                System.out.println(digit + " co so luong uoc chan");
            } else {
                System.out.println(digit + " co so luong uoc le");
            }
        }
        scanner.close();
    }
}
