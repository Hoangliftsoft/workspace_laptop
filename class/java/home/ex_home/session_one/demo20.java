import java.util.Scanner;

public class demo20 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap c: ");
        char characters = scanner.next().charAt(0);
        
        if(characters >= 'A' && characters <='Z'){
            System.out.println(characters + " la chu in hoa");
        }else{
            System.out.println(characters + " khong phai la chu in hoa");
        }
    }
}
