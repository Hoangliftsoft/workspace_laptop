import java.util.Scanner;

public class demo15 {

    // hàm điếm số lẻ
    private static int is_le(int n) {
        int le = 0;
        while (n != 0) {
            int tmp = n % 10;
            if (tmp % 2 != 0)
                ++le;
            n /= 10;
        }
        return le;
    }

    // hàm điếm số chẵn
    private static int is_chan(int n) {
        int chan = 0;
        while (n != 0) {
            int tmp = n % 10;
            if (tmp % 2 == 0)
                ++chan;
            n /= 10;
        }
        return chan;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap vao so nguyen: ");
            int digit = scanner.nextInt();
            System.out.println("--> Co " + is_le(digit) + " chu so le\n--> Co " + is_chan(digit) + " chu so chan");
        } catch (Exception e) {
            System.out.println("Ngoai le phat sinh : " + e);
        }
        scanner.close();
    }
}
