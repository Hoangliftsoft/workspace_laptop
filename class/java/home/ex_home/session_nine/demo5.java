import java.util.Scanner;

public class demo5 {
    // ham tinh tong uoc
    private static int sum_uoc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input test case amount: ");
        int amount = scanner.nextInt();
        while ((amount--) != 0) {
            System.out.print("Input Number: ");
            int number = scanner.nextInt();
            System.out.print("Sum uoc = " + sum_uoc(number));
            System.out.print("\n");
        }
        scanner.close();
    }
}
