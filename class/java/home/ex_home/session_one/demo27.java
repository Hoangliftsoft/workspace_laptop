import java.util.Scanner;

public class demo27 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();
        System.out.print("Input c: ");
        int c = scanner.nextInt();

        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
