import java.util.Scanner;

public class demo19 {

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

        System.out.println("Input FirstNumber: ");
        int i=scanner.nextInt();
        System.out.println("Input SecondNumber: ");
        int n=scanner.nextInt();
        
        System.out.print("Cac so hoan hao la: ");
        int count = 0;
        for(;i<=n;++i){
            if(shh(i)==1){
                System.out.print(i+" ");
                ++count;
            }
        }
        if(count == 0)  
            System.out.print("0");
    }
}
