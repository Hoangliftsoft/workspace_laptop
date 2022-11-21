import java.util.Scanner;

public class demo21 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap c: ");
        char characters = scanner.next().charAt(0);

        if ((characters >= 'a' && characters <= 'z') || (characters >= 'A' && characters <= 'Z')) {
            System.out.println(characters + " la chu cai");
        } else {
            System.out.println(characters + " khong phai la chu cai");
        }
    }
}