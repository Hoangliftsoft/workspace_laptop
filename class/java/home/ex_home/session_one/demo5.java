import java.util.Scanner;
import java.lang.Math;
public class demo5{
        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap n: ");
            int n = scanner.nextInt();

            System.out.println("Tri tuyet doi cua " +n+ " la: " +Math.abs(n));
    }
}
