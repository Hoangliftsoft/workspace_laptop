import java.util.Scanner;

public class demo12 {
    private static int is_fibonacci(int n) {
        int fn, fn1 = 0, fn2 = 1;
        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 3; i <= 93; ++i) {
            fn = fn1 + fn2;
            if (n == fn)
                return 1;
            fn1 = fn2;
            fn2 = fn;
        }
        return 0;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap so luong test case: ");
            int amount = scanner.nextInt();
            while ((amount--) != 0) {
                try {
                    System.out.print("Nhap so nguyen: ");
                    int digit = scanner.nextInt();
                    if (is_fibonacci(digit) == 1) {
                        System.out.println("--> " + digit + " la so fibonacci");
                    } else {
                        System.out.println("--> " + digit + " khong phai la so fibonacci");
                    }
                } catch (Exception e) {
                    System.out.println("! Ngoai le phat sinh: " + e);
                }
            }
        } catch (Exception e) {
            System.out.println("! Ngoai le phat sinh: " + e);
        }
        scanner.close();
    }
}