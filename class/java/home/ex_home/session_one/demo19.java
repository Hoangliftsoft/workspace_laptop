import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class demo19 {
    public static void main(String[] agrs){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Nhap c: ");
        char characters = scanner.next().charAt(0);
        
        if(characters >= 'a' && characters <= 'z'){
            System.out.println(characters +" la chu cai thuong");
        }else{
            System.out.println(characters +" khong phai la chu cai thuong");
        }
    }
}