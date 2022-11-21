import java.util.Scanner;

public class demo14 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        int chan = 0,le = 0;
        while(n!=0){
            int x = n%10;
            if(x%2==0){
                chan +=x;
            }else if(x%2!=0){
                le+=x;
            }
            n/=10;
        }
        System.out.println("Chan = "+chan+"\nLe = "+le);
    }
}
