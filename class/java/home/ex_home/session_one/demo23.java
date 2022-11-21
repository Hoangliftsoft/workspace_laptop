import java.util.Scanner;

public class demo23 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap characters: ");
        char characters = scanner.next().charAt(0);

        if((characters >= 'a' && characters <='z')){
            System.out.println(characters);
        }else if(characters >= 'A' && characters <= 'Z'){
            characters += 32;
            System.out.println((char)characters);
        }else{
        System.out.println(characters);
        }
    }
}
