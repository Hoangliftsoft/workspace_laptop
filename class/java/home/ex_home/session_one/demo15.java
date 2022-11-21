import java.util.Scanner;

public class demo15 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        if((n%2==0)){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}
