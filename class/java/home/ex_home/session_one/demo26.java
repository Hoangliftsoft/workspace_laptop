import java.util.Scanner;

public class demo26 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();
        System.out.print("Input c: ");
        int c = scanner.nextInt();

        if(a>=b&&a>=c){
            System.out.println("Max = " +a);
        }else if(b>=a&&b>=c){
            System.out.println("Max = " +b);
        }else if(c>=a&&c>=b){
            System.out.println("Max = " +c);
        }

        if(a<=b&&a<=c){
            System.out.println("Min = " +a);
        }else if(b<=a&&b<=c){
            System.out.println("Min = " +b);
        }else if(c<=a&&c<=b){
            System.out.println("Min = " +c);
        }
    }
}
