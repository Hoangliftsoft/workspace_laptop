import java.util.Scanner;

public class demo5 {
    // ham ve nua hinh thoi ben phai
    private static void nuahthoi(int n) {
        int d = 1;
        for (int i = 1; i >= 1; i += d) {
            for (int j = 1; j <= i; ++j)
                System.out.print("*");
            System.out.print("\n");
            if (i == n)
                d = -1;
        }
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        nuahthoi(n);
    }
}
