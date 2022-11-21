
// chua xong

import java.util.Scanner;

public class demo22 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ki tu: ");
        char kiTu = scanner.next().charAt(0);
        int number = (int)kiTu;

            System.out.println(kiTu);
            System.out.println(number);

        if(kiTu >=0 || kiTu <= 0){
            System.out.println(kiTu + " la chu so");
        }else{
            System.out.println(kiTu + " khong phai la chu so");
        }
    }
}