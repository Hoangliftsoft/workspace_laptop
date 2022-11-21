import java.util.Scanner;

public class demo18 {

    // ham ktra so hoan hao
    private static int shh(int n){
        int tam = 0;
        for(int i=1;i<n;++i){
            if(n%i==0)
                tam+=i;
        }
        if(tam == n)    return 1;
        return 0;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n= scanner.nextInt();
        if(shh(n)==1)
            System.out.println(n+" la so hoan hao");
        else 
            System.out.println(n+" khong phai la so hoan hao");

    }
}
