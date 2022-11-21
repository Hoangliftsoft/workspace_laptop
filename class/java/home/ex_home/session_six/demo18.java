import java.util.Scanner;

public class demo18 {
    // ham ve tam giac vuong phai rong
    private static void tgv(int number) {
        for (int i = 1; i <= number; ++i) {
            for (int j = 1; j <= number; ++j) {
                if (j <= number - i) {
                    System.out.print("~");
                } else if (i == number || j == number || j == number + 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int number = scanner.nextInt();
        tgv(number);
    }
}
