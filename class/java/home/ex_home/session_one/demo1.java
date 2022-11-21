import java.text.DecimalFormat;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] agrs) {
        // 1.khai báo
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        // 2.input
        System.out.println("Nhap so thu nhat: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhap so thu hai: ");
        int secondNumber = scanner.nextInt();

        // 2.calculate
        // a.calculate sum
        int summation = firstNumber + secondNumber;
        System.out.println("Summation = " + firstNumber + " + " + secondNumber + " = " + summation);
        // b.calculate subtraction
        int subtraction = firstNumber - secondNumber;
        System.out.println("subtraction = " + firstNumber + " - " + secondNumber + " = " + subtraction);
        // c.calculate multiplication
        int multiplication = firstNumber * secondNumber;
        System.out.println("multiplication = " + firstNumber + " x " + secondNumber + " = " + multiplication);
        // d.calculate division
        float division = (float)firstNumber / secondNumber;
        System.out.println("division = " + firstNumber + " / " + secondNumber + " = " + decimalFormat.format(division));
    }
}