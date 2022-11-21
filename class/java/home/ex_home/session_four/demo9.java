import java.util.Scanner;

public class demo9 {
    private static int snt(int n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i==0)  return 0;
        }
        return 1;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input FirstNumber: ");
        int i=scanner.nextInt();
        System.out.println("Input SecondNumber: ");
        int n=scanner.nextInt();
        System.out.print("Snt: ");
        for(;i<=n;++i){
            if(snt(i)==1)
                System.out.print(i+" ");
        }
        
    }
}
