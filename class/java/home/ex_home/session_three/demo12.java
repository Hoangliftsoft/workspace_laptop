import java.util.Scanner;

public class demo12 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n= scanner.nextInt();
        int count=0;
        while(n!=0){
            ++count;
            n/=10;
        }
        System.out.println("Count = "+count);
    }
}
