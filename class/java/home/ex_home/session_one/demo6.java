import java.util.Scanner;

public class demo6 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a= scanner.nextInt();
        System.out.print("Nhap b: ");
        int b= scanner.nextInt();

        System.out.println("Pow = "+ (int)Math.pow(a, b));
    }
}
