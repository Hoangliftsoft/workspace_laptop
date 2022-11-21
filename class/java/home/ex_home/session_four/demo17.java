import java.util.Scanner;

public class demo17 {

    // check arstrong
    private static int arstrong(int n){
        int ars = 0, count =0;
        int coppy=n,counts = n ;
        while(counts!=0){
            ++count;
            counts/=10;
        }
        while(n!=0){
            int cup = n%10;
            ars+=Math.pow(cup, count);
            n/=10;
        }
        if(ars == coppy)    return 1;
        return 0;
    }
    // output
    private static void main_coppy(int n){
        System.out.print("Arstrong : ");
        for(int i=1;i<=n;++i){
            if(arstrong(i)==1)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] agrs){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        main_coppy(n);
    }
}
