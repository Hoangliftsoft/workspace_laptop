import java.util.Scanner;

public class demo16 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        if((n%3==0)&&(n%5==0)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
