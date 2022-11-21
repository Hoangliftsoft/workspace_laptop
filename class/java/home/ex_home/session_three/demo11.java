import java.util.Scanner;

public class demo11 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap x: ");
        int x = scanner.nextInt();
        System.out.println("Nhap y: ");
        int y = scanner.nextInt();

        System.out.println(Math.pow(x, y));
    }
}
