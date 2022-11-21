import java.util.Scanner;

public class demo20 {
    // ham ktra so nguyen to
    private static int snt(int n) {
        if (n < 2)
            return 0;
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    // ktra so chia het cho snt va pow(snt,2)
    private static int check(int n, int fir) {
        int count_one = 0, count_two = 0;
        for (int i = fir; i <= n; ++i) {
            if (snt(i) == 1) {
                if (n % i == 0)
                    ++count_one;
                if (n % Math.pow(i, 2) == 0)
                    ++count_two;
            }
        }
        if (count_one > 0 && count_two > 0 && count_one == count_two)
            return 1;
        return 0;
    }

    // ham output
    private static void main_coppy(int fir, int sec) {

        System.out.print("Cac so dep trong day la: ");
        for (int i = fir; i <= sec; ++i) {
            if (check(i, fir) == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input FirstNumber: ");
        int fir = scanner.nextInt();
        System.out.print("Input SecondNumber: ");
        int sec = scanner.nextInt();
        main_coppy(fir, sec);
    }
}
