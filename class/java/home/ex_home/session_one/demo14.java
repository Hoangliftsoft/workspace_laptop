import java.util.Scanner;

public class demo14 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap a: ");
        int b = scanner.nextInt();

        System.out.println("So chia het cho "+b+" nho nhat la: "+(a+(b-1))/b*b);
    }
}
