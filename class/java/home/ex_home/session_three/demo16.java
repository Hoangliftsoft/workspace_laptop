import java.util.Scanner;

public class demo16 {
    private static int snt(long n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i==0){
                return 0;
            }
        }   return 1;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        Long n= scanner.nextLong();
        int count = 0;
        while(n!=0){
            Long x=n%10;
            if(snt(x)==1){
                ++count;
            }
            n/=10;
        }
        System.out.println("So luong so nguyen to la: "+count);
    }
}
