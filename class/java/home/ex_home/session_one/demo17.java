import java.util.Scanner;

public class demo17 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();

        if(n<=0){
            System.out.println("INVALID");
        }else if((n%4==0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
