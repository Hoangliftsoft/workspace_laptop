import java.util.Scanner;

public class demo10 {
    private static void demChanLe(int n){
        int evenNumber = 0,odd=0;
        while(n!=0){
            int tach=n%10;
            if(tach%2==0)  ++evenNumber;
            else ++odd;
            n/=10;
        }
        System.out.println("EvenNumber: "+evenNumber + "\nOdd: " + odd);
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        demChanLe(n);
    }
}
