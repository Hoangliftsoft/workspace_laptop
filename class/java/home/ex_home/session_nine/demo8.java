import java.util.Scanner;

public class demo8 {
    private static int is_uoc_shh(int digit) {
        int sum = 0;
        for (int i = 1; i < digit; ++i) {
            if (digit % i == 0) {
                sum += i;
            }
        }
        if (sum == digit)
            return 1;
        else
            return 0;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so test case: ");
        int amount = scanner.nextInt();
        while ((amount--) != 0) {
            System.out.print("Nhap vao so nguyen: ");
            int digit = scanner.nextInt();
            if (is_uoc_shh(digit) == 1) {
                System.out.println(digit + " la so hoan hao");
            } else {
                System.out.println(digit + " khong phai la so hoan hao");
            }
        }
        scanner.close();
    }
}
