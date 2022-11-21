import java.util.Scanner;

public class test {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] agrs){
        System.out.print("Nhap ID: ");
        int a =sc.nextInt();
        System.out.print("Nhap Balance: ");
        int b =sc.nextInt();
        account  ac= new account(b, a);
        ac.withdraw(200);
        ac.details();
        ac.deposit(300);
        ac.details();
    }
}
